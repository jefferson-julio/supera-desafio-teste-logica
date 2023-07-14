#!/usr/bin/env bash

print_banner () {
  echo
  echo "- Rodando Desafio $1 -"
  echo 

  sleep 1

  echo "# Entrada"
  echo -e $2
  echo
  sleep 2.5
}

print_output () {
  echo "# Saida"
  cat -
  sleep 1
}

# Desafio 1
#
cd ./desafio-1
INPUT="10\n4\n32\n34\n543\n3456\n654\n567\n87\n6789\n98"

print_banner 1 "$INPUT"

echo -e $INPUT | ./run_test.sh | print_output

# Desafio 2

cd ../desafio-2
INPUT="576.73"

print_banner 2 "$INPUT"

echo $INPUT | ./run_test.sh | print_output

# Desafio 3

cd ../desafio-3
INPUT="5 2\n1 5 3 4 2"

print_banner 3 "$INPUT"

echo -e $INPUT | ./run_test.sh | print_output

# Desafio 4

cd ../desafio-4
INPUT="5\nI ENIL SIHTHSIREBBIG S\nLEVELKAYAK\nH YPPAHSYADILO\nABCDEFGHIJKLMNOPQRSTUVWXYZ\nVOD OWT SNEH HCNERF EGDIRTRAP A DNA SE"

print_banner 4 "$INPUT"

echo -e $INPUT | ./run_test.sh | print_output
