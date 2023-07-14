#!/usr/bin/env bash

compile () {
  javac ./Desafio.java
}

run () {
  java Desafio
}

if [ -p /dev/stdin ]; then
  INPUT=$(cat -)
fi

if [ -z "$INPUT" ]; then
  echo "Gostaria de fornecer o input do desafio agora?";
  echo "Se sim, escreva os dois números inteiros n e k.";
  echo "Senão, apenas pressione enter."
  read -e INPUT

  if ! [ -z "$INPUT" ]; then
    echo
    echo "Agora escreva os números do array de inteiros"
    read -e INPUT_2

    INPUT="$INPUT
$INPUT_2"
  fi
fi

compile

if [ -z "$INPUT" ]; then
  echo
  run
else
  echo -e "$INPUT" | run
fi
