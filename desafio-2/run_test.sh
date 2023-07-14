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
  echo "Se sim, escreva o número decimal de entrada.";
  echo "Senão, apenas pressione enter."
  read -e INPUT
fi

compile

if [ -z "$INPUT" ]; then
  echo
  run
else
  echo $INPUT | run
fi
