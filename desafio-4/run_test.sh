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
  echo "Se sim, escreva o número de linhas que se seguirá.";
  echo "Senão, apenas pressione enter."
  read -e INPUT

  if ! [ -z "$INPUT" ]; then
    echo
    echo "Agora escreva as linhas"
    # run a loop by a number of times identified on the $INPUT variable
    ie="$INPUT"
    for i in $(seq 1 $ie); do
      read -e INPUT_LINE
      INPUT="$INPUT
$INPUT_LINE"
    done
  fi
fi

compile

if [ -z "$INPUT" ]; then
  echo
  run
else
  echo -e "$INPUT" | run
fi
