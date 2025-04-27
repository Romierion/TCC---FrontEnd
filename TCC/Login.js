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

let login = document.getElementById('login');
let email = document.getElementById('email');
let senha = document.getElementById('senha');
login.addEventListener('submit', function (event) {
    event.preventDefault();
    if (!email.value.includes('@saude') || !email.value.includes('.com')) {
        alert('Por favor, insira um email válido!');
        email.focus();
        return;
    }
    if (!email.value.includes('hospital@saude.com')) {
        alert('Email não encontrado!.');
        email.focus();
        return;
    }
    if (!senha.value.includes('098765')) {
        alert('Senha inválida!');
        senha;focus();
        return;
    }

    // Animação de saída
    document.body.classList.add('fade-out');
    setTimeout(() => {
        window.location.assign("Hospital.html");
    }, 1000); // Tempo deve coincidir com o CSS
});