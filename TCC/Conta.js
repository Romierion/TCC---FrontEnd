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

function formatarCNPJ(cnpj) {
    cnpj = cnpj.replace(/\D/g, '');
    cnpj = cnpj.replace(/(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})/, '$1.$2.$3/$4-$5');
    return cnpj;
}
const inputCNPJ = document.getElementById('cnpj');
inputCNPJ.addEventListener('input', function () {
    this.value = formatarCNPJ(this.value);
});

function formatarTelefone(telefone) {
    telefone = telefone.replace(/\D/g, '');
    telefone = telefone.replace(/(\d{2})(\d{1})(\d{4})(\d{4})/, '($1) $2 $3-$4');
    return telefone;
}
const inputTelefone = document.getElementById('telefone');
inputTelefone.addEventListener('input', function () {
    this.value = formatarTelefone(this.value);
});

let form = document.getElementById('form');
let email = document.getElementById('email');
form.addEventListener('submit', function (event) {
    event.preventDefault();
    const cnpj = document.getElementById('cnpj').value.replace(/\D/g, ''); // Remove formatação
    const telefone = document.getElementById('telefone').value.replace(/\D/g, ''); // Remove formatação
    if (cnpj.length !== 14) {
        alert('CNPJ deve ter 14 dígitos');
        return;
    }
    
    if (telefone.length !== 11) {
        alert('Telefone deve ter 11 dígitos');
        return;
    }
    if (!email.value.includes('.com')) {
        alert('Por favor, insira um email válido.');
        email.focus();
        return;
    }
    alert('Cadastro atualizado!');

    // Animação de saída
    document.body.classList.add('fade-out');
    setTimeout(() => {
        window.location.assign("Hospital.html");
    }, 1000); // Tempo deve coincidir com o CSS
});

let form1 = document.getElementById('form1');
let cancelar = document.getElementById('cancelar');
form1.addEventListener('submit', function (event) {
    event.preventDefault();
    if (prompt('Deseja cancelar a conta?\nDigite "sim" para confirmar.') === 'sim') {
        alert('Conta cancelada!');
        // Animação de saída
        document.body.classList.add('fade-out');
        setTimeout(() => {
            window.location.assign("Login.html");
        }, 1000); // Tempo deve coincidir com o CSS
    } else {
        return;
    }
});