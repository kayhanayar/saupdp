#include "Kisi.h"
#include<stdlib.h>
#include<string.h>
#include<stdio.h>
Kisi kisiOlustur(int yas,char* isim)
{
    Kisi yenikisi = (Kisi)malloc(sizeof(struct KISI));

    yenikisi->yas= yas;

    yenikisi->isim = strdup(isim);

    return yenikisi;
}

void kisiYokEt(Kisi aktifKisi)
{
    free(aktifKisi->isim);
    free(aktifKisi);
}

void kisiYazdir(Kisi aktifKisi)
{
    printf("Kisi yasi......:%d\n",aktifKisi->yas);
    printf("Kisi yasi......:%s\n",aktifKisi->isim);
}