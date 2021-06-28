package com.example.dependencyinjection

import javax.inject.Inject
// khong the injection wheels class vi 1 ly do nao do
//vi du wheels class la class cua lib ben ngoai khong the chinh sua
class Wheels(var rim: Rim, var tire: Tire) {
}