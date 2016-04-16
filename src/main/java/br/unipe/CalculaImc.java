package br.unipe;

import java.lang.Math;

public class CalculaImc 
{
    public double RetornaImc( double peso, double altura )
    {
		return peso / Math.pow(altura,2);
    }
}
