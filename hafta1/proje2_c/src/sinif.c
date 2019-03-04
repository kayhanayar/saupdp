#include "sinif.h"
#include "kisi.h"
#include<stdlib.h>
#include<stdio.h>
Sinif sinifOlustur(int mevcut)
{
    Sinif aktifSinif = (Sinif)malloc(sizeof(struct SINIF));

    aktifSinif->mevcut = mevcut;

    aktifSinif->ogrenciler = (Kisi*)malloc(sizeof(Kisi)*mevcut);
    
    aktifSinif->ogrenciSayisi = 0 ;
    
    return aktifSinif;


}
void sinifYokEt(Sinif aktifSinif)
{
    
    for(int i=0;i<aktifSinif->ogrenciSayisi;i++)
    {
        kisiYokEt(aktifSinif->ogrenciler[i]);

    }

    free(aktifSinif->ogrenciler);

    free(aktifSinif);

}


void ogrenciEkle(Sinif aktifSinif,int yas,char* isim)
{
    if(aktifSinif->ogrenciSayisi == aktifSinif->mevcut)
        return;

    aktifSinif->ogrenciler[aktifSinif->ogrenciSayisi] = kisiOlustur(yas,isim);

    aktifSinif->ogrenciSayisi++;
}
void sinifYazdir(Sinif aktifSinif)
{
    printf("-----------------------------------------\n");
    printf("Sinif Listesi\n");
    printf("-----------------------------------------\n");
    for(int i=0;i<aktifSinif->ogrenciSayisi;i++)
    {
        kisiYazdir(aktifSinif->ogrenciler[i]);
         printf("-----------------------------------------\n");
    } 
}