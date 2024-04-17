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
    <h1> Connexion</h1>
</header>
<main>
    <form action="saveUser" method="post">
        <div>
            <label for="email">Email : </label>
            <input type="email" id="email" name="email">
        </div>
        <div>
            <label for="mot_de_passe">Mot de passe:</label>
            <input type="password" id="mot_de_passe" name="mot_de_passe">
        </div>
        <div>
            <input type="submit" value="Connexion">
            <input type="submit" value="CreateComte">
        </div>
    </form>
</main>

</body>
</html>
