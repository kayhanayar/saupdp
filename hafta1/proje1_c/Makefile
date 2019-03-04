all:derle baslat

derle:kisi.o main.o
	gcc ./lib/main.o ./lib/kisi.o -o ./bin/program

kisi.o:
	gcc -I "./include" -c ./src/Kisi.c -o ./lib/Kisi.o

main.o:
	gcc -I "./include" -c ./src/main.c -o ./lib/main.o

baslat:
	./bin/program
