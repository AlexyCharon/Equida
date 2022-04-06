<%-- 
    Document   : Menu
    Created on : 23 sept. 2021, 14:43:41
    Author     : HP-OMEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Equida</title>
        <link rel="StyleSheet" href="./../css/style.css" type="text/css" />
    </head>
    <body>
        <div class="header">
        <button class="top-right" onclick="ToggleSlider();SliderContentSetState('choice');"><</button>
        <h1 style="font-size: 120px;font-family:'Cinzel', serif;">EQUIDA</h1>
        <div class="divider big round"></div>
        <nav style="font-size: 25px;">
            <a>Accueil</a>
            <a>Ventes</a>
            <a>Courses</a>
            <a href="#" onclick="ToggleSlider();SliderContentSetState('contact');">Contact</a>
        </nav>
        </div>
        
    <aside class="sidebar">
      <div class="sidebar-header">
        <button class="close-btn" onclick="ToggleSlider();SliderContentSetState('reset');">></button>
      </div>
      <div class="sidebar-body">
        <div class="choice hide">
            <h1>Mon Espace</h1>
            <button class="openConnection" onclick="SliderContentSetState('connection');">Connection</button>
            <button class="openInscription" onclick="SliderContentSetState('inscription');">Inscription</button>
        </div>
        <div class="form inscription hide">
            <h1>Inscription</h1>
            <form>
                <input type="mail" id="mail" name="mail" value="" placeholder="e-mail">
                <br>
                <input type="text" id="nom" name="nom" value="" placeholder="Nom">
                <br>
                <input type="text" id="prenom" name="prenom" value="" placeholder="Prenom">
                <br>
                <input type="password" id="mdp" name="mdp" value="" placeholder="Mot de passe">
                <br>
                <input type="password" id="confMdp" name="confMdp" value="" placeholder="Confirmer mot de passe">
                <br>
                <input type="checkbox" id="cgu" name="cgu"/>
                <label for="cgu">J'accepte les CGU</label>
                <br>
                <input type="submit" value="S'inscrire">
            </form>
            <p>Déjà un compte? <a href="#" onclick="SliderContentSetState('connection');">Se connecter!</a></p>
        </div>
        
        <div class="form connection hide">
            <h1>Connection</h1>
            <form>
                <input type="mail" id="mailCo" name="mail" value="" placeholder="e-mail">
                <br>
                <input type="password" id="mdpCo" name="mdp" value="" placeholder="Mot de passe">
                <br>
                <input type="submit" value="Se connecter">
            </form>
            <p>Pas encore de compte? <a href="#" onclick="SliderContentSetState('inscription');">S'inscrire!</a></p>
        </div>
        
        <div class="form contact hide">
            <h1>Contact</h1>
            <form>
                 <input type="mail" id="mailContact" name="mail" value="" placeholder="e-mail">
                <br>
                <input type="text" id="nomContact" name="nom" value="" placeholder="Nom">
                <br>
                <input type="text" id="prenomContact" name="prenom" value="" placeholder="Prenom">
                <br>
                <textarea id="msgContact" name="msgContact" value="" placeholder="Message"></textarea>
                <br>
                <input type="submit" value="Envoyer">
            </form>
        </div>
        
      </div>
    </aside>
    <!-- javascript  sidebar-->
    <script>

        
        links = document.querySelector('.sidebar');
        
        connection = document.querySelector('.connection');
        inscription = document.querySelector('.inscription');
        choice = document.querySelector('.choice');
        contact = document.querySelector('.contact');
        
        function ToggleSlider(){
            SliderContentSetState('reset');
            links.classList.toggle('show');
        }
       
        function SliderContentSetState(state){
            sliderContentState = state;
            switch(sliderContentState){
                case "choice":
                    choice.classList.remove('hide');
                    break;
                case "inscription":
                    inscription.classList.remove('hide');
                    connection.classList.add('hide');
                    choice.classList.add('hide');
                    break;
                case "connection":
                    connection.classList.remove('hide');
                    inscription.classList.add('hide');
                    choice.classList.add('hide');
                    break;
                case "contact":
                    contact.classList.remove('hide');
                    break;
                case "reset":
                    inscription.classList.add('hide');
                    choice.classList.add('hide');
                    connection.classList.add('hide');
                    contact.classList.add('hide');
                    break;
            }
        }
    </script>
    </body>
</html>
