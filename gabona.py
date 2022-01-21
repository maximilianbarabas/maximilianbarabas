gabona_nev = input('Gabona: ')
if gabona_nev == '':
	exit()


gabonak = ['búza', 'árpa', 'zab', 'kukorica', 'rozs']

if gabona_nev in gabonak:
	print('megfelelő gabona')
else:
	print('Ismeretlen gabona')
