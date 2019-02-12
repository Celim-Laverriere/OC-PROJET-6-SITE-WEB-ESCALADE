/* ==================================================== */
/* ===== Script de la jsp formulaire_site_complet ===== */
/* ==================================================== */

$(function () {

    var configSelectFormulaire = $('#configSelectFormulaire').text();

    $('span[id="test"]').text(configSelectFormulaire);

    switch (configSelectFormulaire) {

        case 'formulaireSite':
            $('#navSite > .nav-link').attr('class', 'nav-link active');
            $('#configSelectFormulaire').hide();
            $('#formulaireSecteur').hide();
            $('#formulaireVoie').hide();
            $('#formulaireLongueurRelai').hide();
            break;
        case 'formulaireSecteur':
            $('#configSelectFormulaire').hide();
            $('#formulaireSite').hide();
            $('#formulaireVoie').hide();
            $('#formulaireLongueurRelai').hide();
            break;
        case 'formulaireVoie':
            $('#configSelectFormulaire').hide();
            $('#formulaireSite').hide();
            $('#formulaireSecteur').hide();
            $('#formulaireLongueurRelai').hide();
            break;
        case 'formulaireLongueurRelai' :
            $('#configSelectFormulaire').hide();
            $('#formulaireSite').hide();
            $('#formulaireSecteur').hide();
            $('#formulaireVoie').hide();
            break;
    }
});