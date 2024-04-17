<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Creation</title>
</head>
<body>
<header>
    <h1> Creation Compte</h1>
</header>
<main>
    <form action="saveUser" method="post">
        <div>
            <label for="nom"> Nom : </label>
            <input type="text" id="nom" name="nom">
        </div>
        <div>
            <label for="prenom">Prenom : </label>
            <input type="text" id="prenom" name="prenom">
        </div>
        <div>
            <label for="email">Email : </label>
            <input type="email" id="email" name="email">
        </div>
        <div>
            <label for="Equipe">Equipe : </label>
            <input type="text" id="Equipe" name="Equipe">
        </div>
        <div>
            <label for="Mot de passe">Mot de passe : </label>
            <input type="password" id="Mot de passe" name="Mot de passe">
        </div>
        <div>
            <label for="confirmation_mot_de_passe">Confirmer le mot de passe:</label>
            <input type="password" id="confirmation_mot_de_passe" name="confirmation_mot_de_passe">
        </div>
        <div>
            <input type="submit" value="Create">
        </div>
    </form>
</main>
</body>
</html>


