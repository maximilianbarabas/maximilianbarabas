#############################################
# Barabas Maximilian / Szoft I N / 2022.01.21
#############################################


#crop.py
from os import sep
from cropModel import CropModel
from typing import List

class Crop:
    def __init__(self):
        self.file_name = 'termes.txt'
        self.crops: List[CropModel] = []
        self.output_file_name = 'belet.txt'
        self.sepa = ':'

    def read_content(self):
        fp = open(self.file_name, 'r', encoding='utf-8')
        self.lines = fp.readlines() 
        fp.close()
    
    
    def convert_content(self):        
        for line in self.lines[1:]:
            (id, name, place, size, cropyield, year) = line.split(':')
            cropModel = CropModel(
                id, 
                name, 
                place, 
                int(size),
                float(cropyield.replace(',','.') ), 
                int(year)
                )
            self.crops.append(cropModel)


    # Földterület összesen (összegzés tétel)
    def total_land(self):
        osszeg = 0
        for crop in self.crops:
            osszeg += crop.size
        print('Összes földterület:', osszeg, 'hektár')
        

    # Hány tonna búza termés volt összesen? (összegzés tétel)
    def sum_wheat(self):
        osszeg = 0
        for crop in self.crops:
            if crop.name == 'búza':
                osszeg += crop.cropyield
        print('búza termés összesen', osszeg, 'tonna')

    # 300-nál több termés esetén név és termés legyen kiírtva
    def more_then_three_hundred(self):
        sep = '----------------------------------'
        print(sep)
        print('300-nál több termés')
        for crop in self.crops:
            if crop.cropyield > 300:
                print(crop.name, crop.cropyield)
        

    # Hány területen termelnek árpát? megszámolási tétel
    def area_barley(self):
        darab = 0
        sep = '-----------------------------------'
        print(sep)
        for crop in self.crops:
            if crop.name == 'árpa':
                darab += 1
        print('Árpa termelés ennyi helyen:',darab)
        print(sep)

    # Hány terület nagyobb mint 80 hektár? (megszámolási tétel)
    def area_larger_eighty(self):
        sep = '-----------------------------------'
        darab = 0
        for crop in self.crops:
            if crop.size > 80:
                darab += 1
        print('A terület nagyobb mint 80 hektár:', crop.size)
        print(sep)
    

    # Milyen gabona termett a "Csendes" nevű területen?
    def which_crop_on_csendes(self):
        sep = '-------------------------------'
        for crop in self.crops:
            if crop.place == 'Csendes':
                print('A csendes helyen termelt gabona:', crop.name)
        print(sep)
    
    # Melyik területről lett a legkevesebb búzatermés? (minimum számolási tétel)
    def which_place_wheat_min(self):
        sep = '-------------------------------------'
        min_crop = self.crops[0]
        for crop in self.crops:
            if crop.cropyield < min_crop.cropyield:
                min_crop = crop
        print('Legkevesebb búzatermés innen:', min_crop.place)
        print(sep)
        
    # Irassa állományba azoknak a gabonáknak az adatait, ahol a termés több volt mint 350 tonna.
    # A szeparátor kettőspont legyen, amit a konstruktorban határoz meg. A fájl neve belet.txt is a konstruktorban 
    # legyen meghatározva. A kiíratást a write_large() metódusban végezze el.
    
    def write_large(self):
        print('Fájlba írás kezdete')
        fp = open(self.output_file_name, 'w')
        for crop in self.crops:
            if crop.cropyield > 350:
                fp.write(crop.name)
                fp.write(self.sepa) 
                fp.write(self.place)
                fp.write(self.sepa)
                fp.write(str(crop.size))
                fp.write(self.sepa)
                fp.write(str(crop.cropyield))
                fp.write(self.sepa)
                fp.write(str(crop.year)) 
                fp.write('\n')
                          
        fp.close()
        print('A fájlbaírása vége')

crop = Crop()
crop.read_content()
crop.convert_content()
crop.total_land()
crop.sum_wheat()
crop.more_then_three_hundred()
crop.area_barley()
crop.area_larger_eighty()
crop.which_crop_on_csendes()
crop.which_place_wheat_min()
crop.write_large()


