<?php
$secretPassword = getenv('SECRET_PASSWORD');

if (!$secretPassword) {
    echo "Sua Senha Secreta ainda não está definida!\n";
    exit(1);
}

echo "Sua senha secreta é $secretPassword\n";
