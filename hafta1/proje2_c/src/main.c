#include "sinif.h"

int main(int argc,char**argv)
{
    Sinif yeniSinif = sinifOlustur(5);

    ogrenciEkle(yeniSinif,13,"Ahmet");
    ogrenciEkle(yeniSinif,21,"Mehmet");
    ogrenciEkle(yeniSinif,23,"Ali");
    ogrenciEkle(yeniSinif,33,"Veli");
    sinifYazdir(yeniSinif);

    sinifYokEt(yeniSinif);
}