#ifndef Kisi_h
#define Kisi_h

struct KISI
{
    int     yas;
    char*   isim;
};

//işaretçi için yeni bir tur ismi tanımlanıyor.
typedef struct KISI* Kisi;


Kisi kisiOlustur(int yas,char* isim);
void kisiYokEt(Kisi aktifKisi);

void kisiYazdir(Kisi aktifKisi);


#endif