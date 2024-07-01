<?php

$secretPassword = getenv('SECRET_PASSWORD');

if (!$secretPassword) {
    echo "Sua Senha Secreta ainda não está definida2!\n";
    exit();
}

echo "Sua senha secreta é $secretPassword\n";

?>
