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

function baixarPDF() {
    // Seleciona o conteúdo HTML que você deseja converter em PDF
    const content = document.getElementById("div"); // Aqui, capturamos o conteúdo dentro do <div id="conteudo">

    // Obter o nome da criança
    const nomeCrianca = document.getElementById('criança').textContent.trim();
    const nomeArquivo = nomeCrianca ? `${nomeCrianca}-relatório-tipagem-sanguínea.pdf` : 'relatório-tipagem-sanguínea.pdf';

    // Modificar a altura do conteúdo, se necessário
    content.style.height = '1000px'; // Defina a altura que você deseja, ou use um valor dinâmico

    // Opções de configuração do PDF
    const options = {
        margin: [-7, 0, 0, 0], // Margem do PDF
        filename: nomeArquivo,  // Nome do arquivo PDF com o nome da criança
        html2canvas: { scale: 4 },  // Aumenta a qualidade do conteúdo capturado (quanto maior o valor, maior a qualidade)
        jsPDF: { unit: 'mm', format: 'a4', orientation: 'landscape' }  // Formato A4 (padrão), e orientação paisagem
    };

    // Usa o html2pdf para converter o conteúdo HTML para um arquivo PDF
    html2pdf().from(content).set(options).save(); // Gera o PDF e salva
}

function resultar() {
    let mae = document.getElementById('mae').value;
    let pai = document.getElementById('pai').value;
    let crianca = document.getElementById('crianca').value;
    let tipoMae = document.getElementById('tipoMae').value;
    let tipoPai = document.getElementById('tipoPai').value;
    let rhMae = document.getElementById('rhMae').value;
    let rhPai = document.getElementById('rhPai').value;
    let mamae = mae;
    let papai = pai;
    let criança = crianca;
    let tipagemMae = tipoMae;
    let tipagemPai = tipoPai;
    let fatorRhMae = rhMae;
    let fatorRhPai = rhPai;
    document.getElementById('mamae').textContent = mamae;
    document.getElementById('papai').textContent = papai;
    document.getElementById('criança').textContent = criança;
    document.getElementById('tipagemMae').textContent = tipagemMae;
    document.getElementById('tipagemPai').textContent = tipagemPai;
    document.getElementById('fatorRhMae').textContent = fatorRhMae;
    document.getElementById('fatorRhPai').textContent = fatorRhPai;
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