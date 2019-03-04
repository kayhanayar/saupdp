#include "kisi.h"

int main(int argc,char**argv)
{
    Kisi yeniKisi1 = kisiOlustur(12,"Ahmet");

    Kisi yeniKisi2 = kisiOlustur(14,"Mehmet");

    kisiYazdir(yeniKisi1);

    kisiYazdir(yeniKisi2);
    
    kisiYokEt(yeniKisi1);

    kisiYokEt(yeniKisi2);
}