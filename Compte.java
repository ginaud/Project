/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naziha;
class Compte {
    private int solde = 0;

    public Compte() {}
    public Compte(int solde) {
        this.solde = solde;
    }

    public int getSolde() {
        return this.solde;
    }

    public void depot(int montant) {
        this.solde += montant;
    }
}

