function alterarCor(cor) {
    document.body.style.backgroundColor = cor;
    localStorage.setItem('corDeFundo', cor); // Armazena a cor escolhida
}
window.onload = function () {
    const corSalva = localStorage.getItem('corDeFundo');
    if (corSalva) {
        document.body.style.backgroundColor = corSalva;
    }
};

function resultar() {
    let mae = document.getElementById('Mae').value;
    let pai = document.getElementById('Pai').value;
    let crianca = document.getElementById('crianca').value;
    let tipoMae = document.getElementById('tipoMamae').value;
    let tipoPai = document.getElementById('tipoPapai').value;
    let mamae = mae;
    let papai = pai;
    let criança = crianca;
    let tipagemMae = tipoMae;
    let tipagemPai = tipoPai;
    document.getElementById('mamae').textContent = mamae;
    document.getElementById('papai').textContent = papai;
    document.getElementById('criança').textContent = criança;
    document.getElementById('tipagemMae').textContent = tipagemMae;
    document.getElementById('tipagemPai').textContent = tipagemPai;
    document.getElementById('conteudo2').style.display = 'block'; // block significa bloco de código (instruções)
    document.getElementById('transfusão').style.display = 'block';
    document.getElementById('previsao').style.display = 'block';
}

function salvar() {
    document.getElementById('tooltip').style.display = "block";
}

document.getElementById('onoff1').addEventListener('change', function () { //change serve para alterar o valor de um elemento
    let doarDiv = document.getElementById('doar');

    if (this.checked) {
        doarDiv.style.display = 'block';
    } else {
        doarDiv.style.display = 'none';
    }
});

document.getElementById('onoff2').addEventListener('change', function () {
    let partosDiv = document.getElementById('partos');

    if (this.checked) {
        partosDiv.style.display = 'block';
    } else {
        partosDiv.style.display = 'none';
    }
});

// let sliderElement = document.querySelector("#slider");
// let buttonElement = document.querySelector("#button");

// let sizeProtocolo = document.querySelector("#valor");
// let protocolo = document.querySelector("#protocolo");

// let containerProtocolo = document.querySelector("#container-protocolo");

// let charset = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!';
// let novoProtocolo = '';

// sizeProtocolo.innerHTML = sliderElement.value;

// slider.oninput = function () {
//     sizeProtocolo.innerHTML = this.value;
// }

// function gerarProtocolo() {

//     let pass = ''; // id + protocolo gerado
//     for (let i = 0, n = charset.length; i < sliderElement.value; ++i) {
//         pass += charset.charAt(Math.floor(Math.random() * n));
//     }

//     console.log(pass)
//     containerProtocolo.classList.remove("hide");
//     protocolo.innerHTML = pass;
//     novoProtocolo = pass;
// }

function copiarProtocolo() {
    alert("Protocolo copiado com sucesso!")
    navigator.clipboard.writeText(novoProtocolo);
}

function confirmarSaida() {
    var confirmar = confirm("Tem certeza que deseja sair?");
    if (confirmar) {
        window.location.href = 'Login.html';
    }
}

function deletar() {
    var deleta = confirm("Tem certeza que deseja deletar o arquivo?");
    if (deleta) {
        alert("Arquivo deletado!");
    }
}
