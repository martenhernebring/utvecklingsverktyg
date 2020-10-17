#!/bin/bash
#Uppgift 4 - Skapa ett skript run_game.sh
NAME=Marten_Hernebring
CAT="$NAME"_labb
#1. Skriva ut ert namn
echo "$NAME"s program
#2. Skapa en katalog med ert namn och suffixet _labb 
mkdir "$CAT"
#3. Kopiera alla java-filer till katalogen
cp *.java "$CAT"
#4. Byt katalog i skriptet till katalogen ovan (den katalog som beskrevs i texten ovanför)
cd "$CAT"
#5. Skriv ut aktuell katalog med pwd för att jag ska se att ni lyckats skapa och byta katalog
pwd
#6. skriv ut att ni ska kompilera- kompilera
#7. Skriv ut att ni kör programmet (“Running game…”)- kör programmet
#8. Skriv ut att programmet är färdigt (“Done”)
#9. Ta bort alla class-filer
#10. Lista katalogen så att jag kan se att class-filerna är borta
ls
