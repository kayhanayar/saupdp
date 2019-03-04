all:derle baslat

derle:kisi.o sinif.o main.o 
	gcc ./lib/main.o ./lib/sinif.o ./lib/kisi.o -o ./bin/program
sinif.o:
	gcc -I "./include" -c ./src/sinif.c -o ./lib/sinif.o
kisi.o:
	gcc -I "./include" -c ./src/Kisi.c -o ./lib/Kisi.o
main.o:
	gcc -I "./include" -c ./src/main.c -o ./lib/main.o
baslat:
	./bin/program