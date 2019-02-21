/* ==================================================== */
/* ===== Script de la jsp formulaire_site_complet ===== */
/* ==================================================== */

configPage();

function configPage() {

    var configSelectFormulaire = $('#configSelectFormulaire').text();

    $('span[id="test"]').text(configSelectFormulaire);

    switch (configSelectFormulaire) {

        case 'formulaireSite':
            $('#navSite').attr('class', 'nav-link active');
            $('#navSecteur').attr('class', 'nav-link disabled');
            $('#navVoie').attr('class', 'nav-link disabled');
            $('#navLongueurRelai').attr('class', 'nav-link disabled');

            $('#configSelectFormulaire').hide();
            $('#formulaireSite').show();
            $('#formulaireSecteur').hide();
            $('#formulaireVoie').hide();
            $('#formulaireLongueurRelai').hide();
            break;
        case 'formulaireSecteur':
            $('#navSite').attr('class', 'nav-link');
            $('#navSecteur').attr('class', 'nav-link active');
            $('#navVoie').attr('class', 'nav-link disabled');
            $('#navLongueurRelai').attr('class', 'nav-link disabled');

            $('#configSelectFormulaire').hide();
            $('#formulaireSite').hide();
            $('#formulaireSecteur').show();
            $('#formulaireVoie').hide();
            $('#formulaireLongueurRelai').hide();
            break;
        case 'formulaireVoie':
            $('#navSite').attr('class', 'nav-link');
            $('#navSecteur').attr('class', 'nav-link');
            $('#navVoie').attr('class', 'nav-link active');
            $('#navLongueurRelai').attr('class', 'nav-link disabled');

            $('#configSelectFormulaire').hide();
            $('#formulaireSite').hide();
            $('#formulaireSecteur').hide();
            $('#formulaireVoie').show();
            $('#formulaireLongueurRelai').hide();
            break;
        case 'formulaireLongueurRelai' :
            $('#navSite').attr('class', 'nav-link');
            $('#navSecteur').attr('class', 'nav-link');
            $('#navVoie').attr('class', 'nav-link');
            $('#navLongueurRelai').attr('class', 'nav-link active');

            $('#configSelectFormulaire').hide();
            $('#formulaireSite').hide();
            $('#formulaireSecteur').hide();
            $('#formulaireVoie').hide();
            $('#formulaireLongueurRelai').show();
            break;
    }
}

/* ============================================================ */
/* == Gestion des événements sur le navigateur de formulaire == */
/* ============================================================ */

    /* ==== Nav Site ==== */
    $('#navSite').click(function () {

       var navSecteur = $('#navSecteur').attr('class');
       var navVoie = $('#navVoie').attr('class');
       var navLongueur = $('#navLongueurRelai').attr('class');

        $('#navSite').attr('class', 'nav-link active');

        if(navSecteur ==  "nav-link active" || navSecteur ==  "nav-link"){
            $('#navSecteur').attr('class', 'nav-link');
        } else {
            $('#navSecteur').attr('class', 'nav-link disabled');
        }

        if(navVoie ==  "nav-link active" || navVoie ==  "nav-link"){
            $('#navVoie').attr('class', 'nav-link');
        } else {
            $('#navVoie').attr('class', 'nav-link disabled');
        }

        if(navLongueur ==  "nav-link active" || navLongueur ==  "nav-link"){
            $('#navLongueurRelai').attr('class', 'nav-link');
        } else {
            $('#navLongueurRelai').attr('class', 'nav-link disabled');
        }

        $('#configSelectFormulaire').hide();
        $('#formulaireSite').show();
        $('#formulaireSecteur').hide();
        $('#formulaireVoie').hide();
        $('#formulaireLongueurRelai').hide();

    });

    /* ==== Nav Secteur ==== */
    $('#navSecteur').click(function () {

        var navSite = $('#navSite').attr('class');
        var navVoie = $('#navVoie').attr('class');
        var navLongueur = $('#navLongueurRelai').attr('class');

        $('#navSecteur').attr('class', 'nav-link active');

        if(navSite ==  "nav-link active" || navSite ==  "nav-link"){
            $('#navSite').attr('class', 'nav-link');
        } else {
            $('#navSite').attr('class', 'nav-link disabled');
        }

        if(navVoie ==  "nav-link active" || navVoie ==  "nav-link"){
            $('#navVoie').attr('class', 'nav-link');
        } else {
            $('#navVoie').attr('class', 'nav-link disabled');
        }

        if(navLongueur ==  "nav-link active" || navLongueur ==  "nav-link"){
            $('#navLongueurRelai').attr('class', 'nav-link');
        } else {
            $('#navLongueurRelai').attr('class', 'nav-link disabled');
        }

        $('#configSelectFormulaire').hide();
        $('#formulaireSite').hide();
        $('#formulaireSecteur').show();
        $('#formulaireVoie').hide();
        $('#formulaireLongueurRelai').hide();
    });

    /* ==== Nav Voie ==== */
    $('#navVoie').click(function () {

        var navSite = $('#navSite').attr('class');
        var navSecteur = $('#navSecteur').attr('class');
        var navLongueur = $('#navLongueurRelai').attr('class');

        $('#navVoie').attr('class', 'nav-link active');

        if(navSite ==  "nav-link active" || navSite ==  "nav-link"){
            $('#navSite').attr('class', 'nav-link');
        } else {
            $('#navSite').attr('class', 'nav-link disabled');
        }

        if(navSecteur ==  "nav-link active" || navSecteur ==  "nav-link"){
            $('#navSecteur').attr('class', 'nav-link');
        } else {
            $('#navSecteur').attr('class', 'nav-link disabled');
        }

        if(navLongueur ==  "nav-link active" || navLongueur ==  "nav-link"){
            $('#navLongueurRelai').attr('class', 'nav-link');
        } else {
            $('#navLongueurRelai').attr('class', 'nav-link disabled');
        }

        $('#configSelectFormulaire').hide();
        $('#formulaireSite').hide();
        $('#formulaireSecteur').hide();
        $('#formulaireVoie').show();
        $('#formulaireLongueurRelai').hide();
    });

    /* ==== Nav Longueur & Relai ==== */
    $('#navLongueurRelai').click(function () {

        var navSite = $('#navSite').attr('class');
        var navSecteur = $('#navSecteur').attr('class');
        var navVoie = $('#navVoie').attr('class');

        $('#navLongueurRelai').attr('class', 'nav-link active');

        if(navSite ==  "nav-link active" || navSite ==  "nav-link"){
            $('#navSite').attr('class', 'nav-link');
        } else {
            $('#navSite').attr('class', 'nav-link disabled');
        }

        if(navSecteur ==  "nav-link active" || navSecteur ==  "nav-link"){
            $('#navSecteur').attr('class', 'nav-link');
        } else {
            $('#navSecteur').attr('class', 'nav-link disabled');
        }

        if(navVoie ==  "nav-link active" || navVoie ==  "nav-link"){
            $('#navVoie').attr('class', 'nav-link');
        } else {
            $('#navVoie').attr('class', 'nav-link disabled');
        }

        $('#configSelectFormulaire').hide();
        $('#formulaireSite').hide();
        $('#formulaireSecteur').hide();
        $('#formulaireVoie').hide();
        $('#formulaireLongueurRelai').show();
    });


            /* ======================== */
            /* ==== Gestion du CSS ==== */
            /* ======================== */

    $(function () {
        $('#navigateur').css('margin-top', '2%');
        $('div[id*="formulaire"][class="row"]').css('margin-top', '2%');
        $(':button:not(#valRecherche, #ajouterUneLongueur)').attr('style', style="width: 100%");
    });


/* ========================================================== */
/* == Gestion de l'événements ajouer une nouvelle longueur == */
/* ========================================================== */

    $('#validerFormulaire').click(function () {
        $('#validerFormulaire').attr('value', longueursRelais);
    });

    /* ===== Modifier une longueeur ===== */
    $('#selectRelaiModif').click(function () {
        $('#selectLongueurModif').collapse('show');
        $('#modifier_longueur').collapse('show');
    });


    $('#validezSelectLongueur').click(function () {
        $('#modifierLongueur').collapse('show');
        var numRelai = $('#selectLongueur').val();

       $('#afficheNumLongueurModif').text(numRelai);
       $('#numLongueurModif').val(numRelai);
       $('#selectLongueurModif').collapse('hide');

    });

    $('#annulerModif').click(function () {
        $('#modifierLongueur').collapse('hide');
    });










