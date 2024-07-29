document.addEventListener("DOMContentLoaded", function(){
    const nameInput = document.getElementById('nameInput');
    const submitButton = document.getElementById('submitButton');
    const nameFormContainer = document.getElementById('nameFormContainer');
    const greetingSection = document.getElementById('greetingSection');
    const clock = document.getElementById('clock');
    const welcomeMessageName = document.getElementById('welcomeMessageName');

    submitButton.addEventListener('click', function(){
        const name = nameInput.value;
        if(name){
            welcomeMessageName.textContent = "hojgeldin " + name;
            nameFormContainer.style.display = "none"; //sakladık
            greetingSection.style.display = block;
            recentTime();
        }else{
            alert("Please enter your name.")
        }
    });

    function recentTime() {
        const date = new Date();
        const day = date.toLocaleDateString("tr-TR",  {
            weekday:"long",
            year:"numeric",
            month:"numeric",
            day:"numeric",
        });
        const time = date.toLocaleDateString("tr-TR", {
            hour:"2-digit",
            minute:"2-digit",
            second:"2-digit",
        });
        welcomeMessageName.innerHTML = "Welcome " + nameInput.value + "!" ;
        const totalTime = day + '|' + time;


        
    }
    setInterval(updateTime, 1000);
});







































/*document.addEventListener("DOMContentLoaded", function(){
    document.getElementById('nameFormContainer').classList.add('active');});

function submitName(){
    let name = document.getElementById("name").value;
    if(name){
        localStorage.setItem("userName", name);
        document.getElementById("welcomeMessage").textContent = "Welcome " + name + "!";
        document.getElementById('nameFormContainer').classList.remove('active');
    }else{
        alert("Please enter your name.")
    }
}

document.addEventListener("DOMContentLoaded", function() {
    function localDate(){
        let dateElement = document.getElementById('clock');
        let today = new Date();
        let day = String(today.getDate()).padStart(2,'0');
        let month = String(today.getMonth()+1).padStart(2,'0');
        let year = today.getFullYear();
        let hour = String(today.getHours()).padStart(2,'0')
        let minute = String(today.getMinutes()).padStart(2,'0')
        let second = String(today.getSeconds()).padStart(2,'0');
        let days = ["Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"];
        let dayName = days[today.getDay()];

        let todaysDate = day + '/' + month + '/' + year + ' ' + ' | ' + hour + ':' + minute + ':' + second + ' | ' + dayName;
        dateElement.innerHTML = todaysDate;
    }

    setInterval(localDate,1000);
} ); */
 
