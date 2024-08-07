PGDMP  0    +                |            rentacar    16.2    16.2     *           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            +           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ,           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            -           1262    16878    rentacar    DATABASE     j   CREATE DATABASE rentacar WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'C';
    DROP DATABASE rentacar;
                postgres    false            �            1259    16902    book    TABLE     V  CREATE TABLE public.book (
    book_id integer NOT NULL,
    book_car_id integer NOT NULL,
    book_name text NOT NULL,
    book_mail text NOT NULL,
    book_start_date date NOT NULL,
    book_finish_date date NOT NULL,
    book_price integer NOT NULL,
    book_note text NOT NULL,
    book_case text NOT NULL,
    book_idno text NOT NULL
);
    DROP TABLE public.book;
       public         heap    postgres    false            �            1259    16895    brand    TABLE     [   CREATE TABLE public.brand (
    brand_id integer NOT NULL,
    brand_name text NOT NULL
);
    DROP TABLE public.brand;
       public         heap    postgres    false            �            1259    16894    brand_brand_id_seq    SEQUENCE     �   ALTER TABLE public.brand ALTER COLUMN brand_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.brand_brand_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    219            �            1259    16879    car    TABLE     �   CREATE TABLE public.car (
    car_id integer NOT NULL,
    car_model_id integer NOT NULL,
    car_color text NOT NULL,
    car_km integer NOT NULL,
    car_plate text NOT NULL
);
    DROP TABLE public.car;
       public         heap    postgres    false            �            1259    16922    car_car_id_seq    SEQUENCE     �   ALTER TABLE public.car ALTER COLUMN car_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.car_car_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    215            �            1259    16887    model    TABLE     �   CREATE TABLE public.model (
    model_id integer NOT NULL,
    model_brand_id integer NOT NULL,
    model_name text NOT NULL,
    model_type text NOT NULL,
    model_year text NOT NULL,
    model_fuel text NOT NULL,
    model_gear text NOT NULL
);
    DROP TABLE public.model;
       public         heap    postgres    false            �            1259    16886    model_model_id_seq    SEQUENCE     �   ALTER TABLE public.model ALTER COLUMN model_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.model_model_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    217            �            1259    16909    user    TABLE     �   CREATE TABLE public."user" (
    user_id integer NOT NULL,
    user_name text NOT NULL,
    user_password text NOT NULL,
    user_role text NOT NULL
);
    DROP TABLE public."user";
       public         heap    postgres    false            �            1259    16914    user_user_id_seq    SEQUENCE     �   ALTER TABLE public."user" ALTER COLUMN user_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.user_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    221            $          0    16902    book 
   TABLE DATA           �   COPY public.book (book_id, book_car_id, book_name, book_mail, book_start_date, book_finish_date, book_price, book_note, book_case, book_idno) FROM stdin;
    public          postgres    false    220   )       #          0    16895    brand 
   TABLE DATA           5   COPY public.brand (brand_id, brand_name) FROM stdin;
    public          postgres    false    219   F                 0    16879    car 
   TABLE DATA           Q   COPY public.car (car_id, car_model_id, car_color, car_km, car_plate) FROM stdin;
    public          postgres    false    215   �       !          0    16887    model 
   TABLE DATA           u   COPY public.model (model_id, model_brand_id, model_name, model_type, model_year, model_fuel, model_gear) FROM stdin;
    public          postgres    false    217   �       %          0    16909    user 
   TABLE DATA           N   COPY public."user" (user_id, user_name, user_password, user_role) FROM stdin;
    public          postgres    false    221   Y       .           0    0    brand_brand_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.brand_brand_id_seq', 6, true);
          public          postgres    false    218            /           0    0    car_car_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.car_car_id_seq', 2, true);
          public          postgres    false    223            0           0    0    model_model_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.model_model_id_seq', 3, true);
          public          postgres    false    216            1           0    0    user_user_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.user_user_id_seq', 101, true);
          public          postgres    false    222            �           2606    16913    book book_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.book
    ADD CONSTRAINT book_pkey PRIMARY KEY (book_idno);
 8   ALTER TABLE ONLY public.book DROP CONSTRAINT book_pkey;
       public            postgres    false    220            �           2606    16899    brand brand_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.brand
    ADD CONSTRAINT brand_pkey PRIMARY KEY (brand_id);
 :   ALTER TABLE ONLY public.brand DROP CONSTRAINT brand_pkey;
       public            postgres    false    219            �           2606    16885    car car_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.car
    ADD CONSTRAINT car_pkey PRIMARY KEY (car_id);
 6   ALTER TABLE ONLY public.car DROP CONSTRAINT car_pkey;
       public            postgres    false    215            �           2606    16891    model model_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.model
    ADD CONSTRAINT model_pkey PRIMARY KEY (model_id);
 :   ALTER TABLE ONLY public.model DROP CONSTRAINT model_pkey;
       public            postgres    false    217            �           2606    16921    user user_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (user_id);
 :   ALTER TABLE ONLY public."user" DROP CONSTRAINT user_pkey;
       public            postgres    false    221            $      x������ � �      #   C   x�3��M-JNMI-�2�t,M��2�t��2��/H��2�J�K,�)�2����..OLO������ �m         >   x�3�4��������4400�46u��4�2�4��u;�!&���$c`�ai����� _�>      !   b   x�E��	� ����h�H���R+���]���!����' �㰆=d'&�S->_�3��`����dv��u��c	nn��:��'�ϽKn����5      %   i  x�uW�o�6�<�+��\�]�H���M�"E��צ5��(�ĕD�Ij�����o�n�����μy�ޘ��[�$S(�몃ZYgZ�V���_�\:m(�uv)�@�~[�=��6�a�����tQHe)��v�{�/m*a�5[	�x�C��|�8�=w�+�`�ak�Jm���n?��������>�x!�5!T��5������!b�W,�"P���h�u<y؋C
[�	������1#9Bx@<(7Ѥ�q���u�a�5B@ؒ���"8��0O�P���\���"��dcp`�1�dx)�~@��&��9�������T\Xď��Ɓ&�yɬ�x�pq��>HʴM#L�����;�f%m�5#5S%�C�+����)��E�|���~ԃU���yMx��uPs��?���R��۰��&�� ��^k]3��k��'p�����@[���N���5�oHB�4�ʭP�pB?��D�uK�����b��xy��!&�/NY.j6����ӳq�����
�?�����C8<�e]U�O'?aG�Jt��O@��D�8N�º��Ȃ��
���g#�#1QF�pn�^�[�Q$�s���{�x�?�e���:����m�է�X�6 Ó+|ĳd�JX��:����X�8�H�÷��o���B��X���o�ޝ0,��I��א�mR��h[��8�2�=C%��r����3�F�� Y�c����q�D��O�fe.p���q�AB�	��������'�c�fe.V���)*�� � �9�),=��� ��L�$_,�
P鐡�<��0%�`=`���]Nr�w� ����!!zM l�j�P�Ю�d���e��3�� A? (O�ɞS���%r*'%��x�9�*VGP���߽�6��%>�	A��I����a�K�Bj-�@Ɠ�=o!]uݵ
�VC��Z���PZ�Y��"y3]ѝ��<h�a&
6�y��!�œs?A4��L��Q�g��v=�K(�៻O�P0��R6�e6�H �Z�KQ�d:H%�2�,�:b��3z��E�QՂ��#��pQ�R�H:ё����Ǘ�`����
����h<����鷆U����1j(��w�,�>��	�J(�\�0P��q=\ b
⩞NБ����(�h8J��]��޻2�y�G�Ag�'?>��8�1':4ŌN^nEhT�D#Jtƻ���31Z��s4ȵ�p3;�O� o�v/�H��
u�����M��L<pJH^j��<���v�k	�Ƣ6�����xr�uA�������j�~<���*�B�eh?��a�H�͐���MBp��?����o7�=�$��4�Z~�@��ۢ�90o���@e5j~-��OwS`���FT��}W��ƥr�ߝ�i	��」)�,c������m��J��fO���]�'>���Y�)ڡum�!��V��㇛�q�S��ŕ�(Z�K���{& a�����iM<���m�i�/���(�pe�|�1E?k��j(�ӟ7;-NX��R��.�.��>�
7�\(ik��p�~ۻ{^���6�oj�{��E#��N�����/?��y3     