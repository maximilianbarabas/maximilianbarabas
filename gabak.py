from operator import truediv


def check_crop_name(name):
    gabonak = ['búza','kukorica', 'zab', 'rozs']
    if name in gabonak:
        return True
    else:
        return False


gabona_nev = ''
while gabona_nev != 'vege':
    gabona_nev = input('Gabona neve: ')
    if gabona_nev != 'vege':
        if check_crop_name(gabona_nev):
            print('Megfelelő')
        else:
            print('Nem felel meg')
        

    