// Ses dosyalarını oluşturun
const sounds = {
    65: new Audio('sounds/kick.wav'),
    83: new Audio('sounds/snare.wav'),
    68: new Audio('sounds/hihat.wav'),
    70: new Audio('sounds/tom.wav'),
    71: new Audio('sounds/tink.wav'),
    72: new Audio('sounds/openhat.wav'),
    74: new Audio('sounds/boom.wav'),
    75: new Audio('sounds/ride.wav'),
    76: new Audio('sounds/clap.wav')
};

function playSound(e) {
    const keyCode = e.keyCode || e.target.getAttribute('data-key');
    const sound = sounds[keyCode];
    if (!sound) return;

    // Tuşa basıldığında animasyon ekleyin
    const key = document.querySelector(`button[data-key="${keyCode}"]`);
    key.classList.add('playing');

    sound.currentTime = 0; // Sesin yeniden başlamasını sağlar
    sound.play();
}

function removeTransition(e) {
    if (e.propertyName !== 'transform') return;
    this.classList.remove('playing');
}
const keys = document.querySelectorAll('.key');
keys.forEach(key => key.addEventListener('transitionend', removeTransition));
keys.forEach(key => key.addEventListener('click', playSound));
window.addEventListener('keydown', playSound);
