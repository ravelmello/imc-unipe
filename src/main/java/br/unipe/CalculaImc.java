package br.unipe;

import java.lang.Math;

public class IMC 
{
    public double RetornaImc( double peso, double altura )
    {
		return peso / pow(altura,2);
    }
}
