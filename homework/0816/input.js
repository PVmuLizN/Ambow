const addData = () => {
    // let target = document.getElementById("target")
    let name = document.getElementById("iname").value;
    let age = document.getElementById("iage").value;
    let gender = document.getElementById("igender").value;
    console.log(name, age, gender);
    let table = document.getElementById("edit");
    let newTr = document.createElement("tr");
    let newTd1 = document.createElement("td");
    let newTd2 = document.createElement("td");
    let newTd3 = document.createElement("td");
    // let newTd4 = document.createElement("td")
    newTd1.innerHTML = name;
    newTd2.innerHTML = age;
    newTd3.innerHTML = gender;
    newTr.appendChild(newTd1);
    newTr.appendChild(newTd2);
    newTr.appendChild(newTd3);
    table.appendChild(newTr);
};
