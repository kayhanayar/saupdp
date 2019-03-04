#ifndef sinif_h
#define sinif_h


struct KISI;

typedef struct KISI* Kisi;

struct SINIF
{
    int mevcut;
    
    int ogrenciSayisi;

    Kisi*   ogrenciler;
};

typedef struct SINIF* Sinif;


Sinif sinifOlustur(int mevcut);

void ogrenciEkle(Sinif aktifSinif,int yas,char* isim);

void sinifYazdir(Sinif aktifSinif);

void sinifYokEt(Sinif aktifSinif);


#endif