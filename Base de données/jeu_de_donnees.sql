/**** OpenClassrooms - Projet 6 ****/
/**** Créez un site communautaire autour de l’escalade ****/

INSERT INTO public.compte
    (nom, prenom, mail, mot_de_passe)
VALUES
    ('Seguin', 'Lena', 'lenaseguin@fakeemail.tld', 'lenaseguin'),
    ('Marechal', 'Kilian', 'kilianmarechal@fakeemail.tld', 'kilianmarechal'),
    ('Julien', 'Quentin', 'quentinjulien@fakeemail.tld', 'quentinjulien'),
    ('Hamon', 'Dimitri', 'dimitrihamon@fakeemail.tld', 'dimitrihamon'),
    ('Chatelain', 'Alicia', 'aliciachatelain@fakeemail.tld', 'aliciachatelain')
;

INSERT INTO public.site
    (compte_id, nom, region, description)
VALUES
    (1, 'Roger', 'Lamalou-les-Bains', 'Ante lobortis venenatis quis. habitasse ad magna posuere. risus vivamus purus quam magna fusce odio. cubilia vehicula class netus. tortor'),
    (2, 'Dufour', 'Saint-Vincent-la-Commanderie', 'Tempor condimentum egestas placerat curae nec tellus. leo vulputate pharetra lectus aliquet fermentum viverra elit. suspendisse nec nunc ultrices pretium'),
    (3, 'Paul', 'Soye', 'Lorem sit proin a proin scelerisque ligula hendrerit viverra'),
    (4, 'Serre', 'Fos-sur-Mer', 'Curabitur lobortis bibendum aptent conubia cubilia mattis torquent. accumsan curabitur donec hac sed. nisl duis neque'),
    (5, 'Vincent', 'Tréouergat', 'Dui duis sit sit vel. volutpat et mauris sodales orci lobortis placerat semper. senectus nostra congue')
;

INSERT INTO public.secteur
    (site_id, nom, description)
VALUES
    (1, 'Niderviller', 'Amet pulvinar dictumst sapien consectetur consequat rhoncus. aptent hac fermentum auctor mollis'),
    (2, 'Souraïde', 'Donec inceptos in netus. curae mi tristique ut tincidunt facilisis ut. cras habitant aenean convallis litora malesuada'),
    (3, 'Franqueville-Saint-Pierre', 'Curabitur amet enim rutrum. curae volutpat viverra praesent. eu ultrices est tortor neque'),
    (4, 'Lespinasse', 'Massa vulputate malesuada sollicitudin condimentum rutrum. gravida sem inceptos laoreet'),
    (5, 'Taradeau', 'Tempus blandit mattis dictumst nibh. a odio lobortis lectus. habitant vivamus viverra potenti nostra proin. faucibus')
;

INSERT INTO public.voie
    (secteur_id, nom, description, type_voie, cotation, hauteur)
VALUES
    (1, 'Hubert Nieul-le-Dolent', 'Dapibus congue sem vivamus hac. interdum litora ut mollis. placerat dolor. Urna egestas congue cursus fermentum posuere feugiat faucibus', 'Equipée', 3, 32),
    (2, 'Brunel Saint-Martin-Longueau', 'Per malesuada duis class enim rutrum. pulvinar nisi lobortis ultrices leo lacus. fames cursus nunc', 'Non équipée', 5, 40),
    (3, 'Pottier Cagnes-sur-Mer', 'Maecenas porta hac justo curabitur mauris. proin scelerisque nisi venenatis quis. ipsum egestas fusce suspendisse', 'Non équipée', 8, 100),
    (4, 'Clement Chailley', 'Pharetra himenaeos ornare luctus sodales malesuada platea. ut sociosqu pellentesque nulla aliquet nibh sem. vitae', 'Equipée', 6, 50),
    (5, 'Merlin Sainte-Escobille', 'Lobortis fusce volutpat egestas nibh. adipiscing cubilia ac ante. sollicitudin vitae ad leo fames. eu', 'Equipée', 4, 22.50)
;

INSERT INTO public.longueur
    (voie_id, num_longueur, hauteur, cotation, num_relai)
VALUES
    (1, 1, 6.50, '3A', 1),
    (1, 2, 10.50, '3A', 2),
    (1, 3, 5, '3B', 3),
    (1, 4, 10, '3A', 0),
    
    (2, 1, 20, '5A', 1),
    (2, 2, 20, '5C', 0),
    
    (3, 1, 20, '8A', 1),
    (3, 2, 25, '8A', 2),
    (3, 3, 35, '8', 3),
    (3, 4, 20, '8B', 0),
    
    (4, 1, 15, '6A', 1),
    (4, 2, 15, '6', 2),
    (4, 3, 20, '6C', 0),
    
    (5, 1, 10, '4A', 1),
    (5, 2, 6, '4', 2),
    (5, 3, 6.50, '4C', 0)
;

INSERT INTO public.topo
    (compte_id, nom, statut, date_upload, description)
VALUES
    (1, 'Edemere', 'libre', '2018-09-25', 'Sollicitudin elit molestie venenatis venenatis conubia netus phasellus. pellentesque dolor suspendisse pellentesque. vulputate amet malesuada lacus platea curae. ultricies suscipit mattis venenatis. semper ullamcorper sollicitudin aptent praesent. elementum curabitur lectus vivamus felis senectus volutpat. nam dolor'), 
    (2, 'Adiatisa', 'reserver', '2018-09-10', 'Primis per nec sollicitudin luctus ornare luctus. tristique amet platea vestibulum curabitur praesent. feugiat fusce lectus posuere vehicula tellus nec per. imperdiet morbi scelerisque posuere congue. ultrices facilisis amet velit maecenas. aenean vitae dolor odio. metus volutpat felis dui lectus condimentum cubilia curabitur. eu ac hac vitae nisi urna'),
    (3, 'Origine', 'libre', '2018-09-22', 'Laoreet dictumst vel integer accumsan platea nisi vulputate. non aliquet dapibus ullamcorper placerat fusce aenean. massa ante viverra quam sem morbi semper. ut eros eu primis nisi diam ad. purus faucibus magna duis molestie fusce et donec. aptent sodales morbi iaculis morbi nam mauris. commodo quis donec eget magna.'),
    (4, 'Land', 'libre', '2018-09-15', 'Ornare fringilla non varius non netus. consequat libero nec sem sapien vehicula lectus nam. duis aliquet nec nullam ut risus porta. leo mattis blandit aenean blandit. nibh ultrices fusce hendrerit sed varius varius. elementum nec non'),
    (5, 'Montagne rouge', 'libre', '2018-09-5', 'Donec urna ad et dictum aenean eget vel. dui habitant gravida hendrerit felis vehicula elit accumsan. lorem justo etiam interdum feugiat leo dui ac. aliquet risus quam tristique aenean maecenas risus. pretium feugiat sagittis sed varius libero ultrices netus.')
;
    
INSERT INTO public.resa_topo
    (topo_id, statut, date_debut, date_fin, compte_id, proprietaire_topo)
VALUES
    (2, 'demande_en_cours','2019-03-15', '2019-03-25', 1, 2)
;

INSERT INTO public.commentaire
    (compte_id, commentaire, site_id, topo_id)
VALUES
    (1, 'Lobortis enim justo ut sem curabitur mattis at. risus aenean elit', 3, null),
    (4, 'Lorem fermentum eu sodales. pretium quam ultrices augue. curabitur sit dolor suspendisse dictumst pharetra.', 1, null),
    (2, 'Curabitur lobortis neque a. tempor erat fames laoreet congue dolor sem. justo urna aliquet tristique pharetra vivamus', null, 5),
    (5, 'Venenatis sem nulla interdum cras. ipsum donec scelerisque nec. torquent duis tortor quisque ligula vel nisl. commodo phasellus auctor', null, 3)
;

INSERT INTO public.photo
    (nom, url_image, topo_id, site_id)
VALUES
    ('Roger', 'imgs/photo_escalade_1.jpg', null, 1),
    ('Dufour','imgs/photo_escalade_2.jpg', null, 2),
    ('Adiatisa','imgs/photo_escalade_3.jpg', 2, null)
;

INSERT INTO public.messagerie
    (resa_topo_id, date_message, message, compte_id)
VALUES
    (1, '2019-03-07', 'Proin lobortis primis aliquam ante. malesuada justo senectus vel dapibus est.', 1)
;
































