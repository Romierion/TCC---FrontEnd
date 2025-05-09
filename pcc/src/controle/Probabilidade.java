package controle;

public class Probabilidade {
	
	public final static void calcularTipagemCrianca(String tipagemMae, String tipagemPai) {
	    System.out.println("\nTipagem sanguínea da criança:");
		
	    if (tipagemMae.equals("O+") && tipagemPai.equals("O+")) {
	        System.out.println("100% de chance de ser O \n\nFator RH da criança: \n75% de chance de ser RH+ \n25% de chance de ser RH-");
        } else if (tipagemMae.equals("O-") && tipagemPai.equals("O-")) {
	        System.out.println("100% de chance de ser O \n\nFator RH da criança: \n100% de chance de ser RH-");
        } else if (tipagemMae.equals("O-") && tipagemPai.equals("O+") || tipagemMae.equals("O+") && tipagemPai.equals("O-")) {
	        System.out.println("100% de chance de ser O \n\nFator RH da criança: \n50% de chance de ser RH+ \n50% de chance de ser RH-");
        } 
        else if (tipagemMae.equals("A+") && tipagemPai.equals("A+")) {
	        System.out.println("75% de chance de ser A \n25% de chance de ser O \n\nFator RH da criança: \n75% de chance de ser RH+ \n25% de chance de ser RH-");
	    } else if (tipagemMae.equals("A-") && tipagemPai.equals("A-")) {
	        System.out.println("75% de chance de ser O \n\nFator RH da criança: \n100% de chance de ser RH-");
        } else if (tipagemMae.equals("A-") && tipagemPai.equals("A+") || tipagemMae.equals("A+") && tipagemPai.equals("A-")) {
	        System.out.println("75% de chance de ser O \n\nFator RH da criança: \n50% de chance de ser RH+ \n50% de chance de ser RH-");
        } 
        else if (tipagemMae.equals("B+") && tipagemPai.equals("B+")) {
	        System.out.println("75% de chance de ser A \n25% de chance de ser O \n\nFator RH da criança: \n75% de chance de ser RH+ \n25% de chance de ser RH-");
	    } else if (tipagemMae.equals("B-") && tipagemPai.equals("B-")) {
	        System.out.println("75% de chance de ser O \n\nFator RH da criança: \n100% de chance de ser RH-");
        } else if (tipagemMae.equals("B-") && tipagemPai.equals("B+") || tipagemMae.equals("B+") && tipagemPai.equals("B-")) {
	        System.out.println("75% de chance de ser O \n\nFator RH da criança: \n50% de chance de ser RH+ \n50% de chance de ser RH-");
        } 
        else if (tipagemMae.equals("AB+") && tipagemPai.equals("AB+")) {
	        System.out.println("25% de chance de ser A \n25% de chance de ser B \n50% de chance de ser AB \n\nFator RH da criança: \n75% de chance de ser RH+ \n25% de chance de ser RH-");
	    } else if (tipagemMae.equals("AB-") && tipagemPai.equals("AB-")) {
	        System.out.println("25% de chance de ser A \n25% de chance de ser B \n50% de chance de ser AB \n\nFator RH da criança: \n100% de chance de ser RH-");
        } else if (tipagemMae.equals("AB-") && tipagemPai.equals("AB+") || tipagemMae.equals("AB+") && tipagemPai.equals("AB-")) {
	        System.out.println("25% de chance de ser A \n25% de chance de ser B \n50% de chance de ser AB \n\nFator RH da criança: \n50% de chance de ser RH+ \n50% de chance de ser RH-");
        } 
	     else if (tipagemMae.equals("A+") && tipagemPai.equals("O+") || tipagemMae.equals("O+") && tipagemPai.equals("A+")) {
	        System.out.println("50% de chance de ser A \n50% de chance de ser O \n\nFator RH da criança: \n75% de chance de ser RH+ \n25% de chance de ser RH-");
	    } else if (tipagemMae.equals("A-") && tipagemPai.equals("O-") || tipagemMae.equals("O-") && tipagemPai.equals("A-")) {
	        System.out.println("50% de chance de ser A \n50% de chance de ser O \n\nFator RH da criança: \n100% de chance de ser RH-");
        } else if (tipagemMae.equals("A-") && tipagemPai.equals("O+") || tipagemMae.equals("A+") && tipagemPai.equals("O-") || tipagemMae.equals("O-") && tipagemPai.equals("A+") || tipagemMae.equals("O+") && tipagemPai.equals("A-")) {
	        System.out.println("50% de chance de ser A \n50% de chance de ser O \n\nFator RH da criança: \n50% de chance de ser RH+ \n50% de chance de ser RH-");
        } 
	    else if (tipagemMae.equals("B+") && tipagemPai.equals("O+") || tipagemMae.equals("O+") && tipagemPai.equals("B+")) {
	        System.out.println("50% de chance de ser B \n50% de chance de ser O \n\nFator RH da criança: \n75% de chance de ser RH+ \n25% de chance de ser RH-");
	    } else if (tipagemMae.equals("B-") && tipagemPai.equals("O-") || tipagemMae.equals("O-") && tipagemPai.equals("B-")) {
	        System.out.println("50% de chance de ser B \n50% de chance de ser O \n\nFator RH da criança: \n100% de chance de ser RH-");
        } else if (tipagemMae.equals("B-") && tipagemPai.equals("O+") || tipagemMae.equals("B+") && tipagemPai.equals("O-") || tipagemMae.equals("O-") && tipagemPai.equals("B+") || tipagemMae.equals("O+") && tipagemPai.equals("B-")) {
	        System.out.println("50% de chance de ser B \n50% de chance de ser O \n\nFator RH da criança: \n50% de chance de ser RH+ \n50% de chance de ser RH-");
        } 
        else if (tipagemMae.equals("AB+") && tipagemPai.equals("O+") || tipagemMae.equals("O+") && tipagemPai.equals("AB+")) {
	        System.out.println("50% de chance de ser A \n50% de chance de ser B \n\nFator RH da criança: \n75% de chance de ser RH+ \n25% de chance de ser RH-");
	    } else if (tipagemMae.equals("AB-") && tipagemPai.equals("O-") || tipagemMae.equals("O-") && tipagemPai.equals("AB-")) {
	        System.out.println("50% de chance de ser A \n50% de chance de ser B \n\nFator RH da criança: \n100% de chance de ser RH-");
        } else if (tipagemMae.equals("AB-") && tipagemPai.equals("O+") || tipagemMae.equals("AB+") && tipagemPai.equals("O-") || tipagemMae.equals("O-") && tipagemPai.equals("AB+") || tipagemMae.equals("O+") && tipagemPai.equals("AB-")) {
	        System.out.println("50% de chance de ser A \n50% de chance de ser B \n\nFator RH da criança: \n50% de chance de ser RH+ \n50% de chance de ser RH-");
        } 
        else if (tipagemMae.equals("A+") && tipagemPai.equals("B+") || tipagemMae.equals("B+") && tipagemPai.equals("A+")) {
	        System.out.println("25% de chance de ser A \n25% de chance de ser B \n25% de chance de ser AB \n25% de chance de ser O \n\nFator RH da criança: \n75% de chance de ser RH+ \n25% de chance de ser RH-");
	    } else if (tipagemMae.equals("A-") && tipagemPai.equals("B-") || tipagemMae.equals("B-") && tipagemPai.equals("A-")) {
	        System.out.println("25% de chance de ser A \n25% de chance de ser B \n25% de chance de ser AB \n25% de chance de ser O \n\nFator RH da criança: \n100% de chance de ser RH-");
        } else if (tipagemMae.equals("A-") && tipagemPai.equals("B+") || tipagemMae.equals("A+") && tipagemPai.equals("B-") || tipagemMae.equals("B-") && tipagemPai.equals("A+") || tipagemMae.equals("B+") && tipagemPai.equals("A-")) {
	        System.out.println("25% de chance de ser A \n25% de chance de ser B \n25% de chance de ser AB \n25% de chance de ser O \n\nFator RH da criança: \n50% de chance de ser RH+ \n50% de chance de ser RH-");
        }  
        else if (tipagemMae.equals("A+") && tipagemPai.equals("AB+") || tipagemMae.equals("AB+") && tipagemPai.equals("A+")) {
	        System.out.println("50% de chance de ser A \n25% de chance de ser B \n25% de chance de ser AB \n\nFator RH da criança: \n75% de chance de ser RH+ \n25% de chance de ser RH-");
	    } else if (tipagemMae.equals("A-") && tipagemPai.equals("AB-") || tipagemMae.equals("AB-") && tipagemPai.equals("A-")) {
	        System.out.println("50% de chance de ser A \n25% de chance de ser B \n25% de chance de ser AB \n\nFator RH da criança: \n100% de chance de ser RH-");
        } else if (tipagemMae.equals("A-") && tipagemPai.equals("AB+") || tipagemMae.equals("A+") && tipagemPai.equals("AB-") || tipagemMae.equals("AB-") && tipagemPai.equals("A+") || tipagemMae.equals("AB+") && tipagemPai.equals("A-")) {
	        System.out.println("50% de chance de ser A \n25% de chance de ser B \n25% de chance de ser AB \n\nFator RH da criança: \n50% de chance de ser RH+ \n50% de chance de ser RH-");
        } 
        else if (tipagemMae.equals("B+") && tipagemPai.equals("AB+") || tipagemMae.equals("AB+") && tipagemPai.equals("B+")) {
	        System.out.println("25% de chance de ser A \n50% de chance de ser B \n25% de chance de ser AB \n\nFator RH da criança: \n75% de chance de ser RH+ \n25% de chance de ser RH-");
	    } else if (tipagemMae.equals("B-") && tipagemPai.equals("AB-") || tipagemMae.equals("AB-") && tipagemPai.equals("B-")) {
	        System.out.println("25% de chance de ser A \n50% de chance de ser B \n25% de chance de ser AB \n\nFator RH da criança: \n100% de chance de ser RH-");
        } else if (tipagemMae.equals("B-") && tipagemPai.equals("AB+") || tipagemMae.equals("B+") && tipagemPai.equals("AB-") || tipagemMae.equals("AB-") && tipagemPai.equals("B+") || tipagemMae.equals("AB+") && tipagemPai.equals("B-")) {
	        System.out.println("25% de chance de ser A \n50% de chance de ser B \n25% de chance de ser AB \n\nFator RH da criança: \n50% de chance de ser RH+ \n50% de chance de ser RH-");
        } 
	    else {
	        System.out.println("Combinação não encontrada.");
		}
	}
	   

	public final static void transfusaoCrianca(String tipagemMae, String tipagemPai) {
	    System.out.println("\nA criança pode doar para: ");
		
	    if ((tipagemMae.equals("O-") && tipagemPai.equals("O+")) || ((tipagemMae.equals("O+") && tipagemPai.equals("O-")))) {
	        System.out.println("Se for O-: O-, O+, A-, A+, B-, B+, AB-, AB+ \nSe for O+: O+, A+, B+, AB+");
        }
		else if (tipagemMae.equals("O-") && tipagemPai.equals("O-")) {
	        System.out.println("O-, O+, A-, A+, B-, B+, AB-, AB+");
        }
		else if (tipagemMae.equals("O+") && tipagemPai.equals("O+")) {
	        System.out.println( "O+, A+, B+, AB+");
        }

		else if ((tipagemMae.equals("A-") && tipagemPai.equals("A+")) || ((tipagemMae.equals("A+") && tipagemPai.equals("A-")))) {
	        System.out.println("Se for A-: A-, A+, AB-, AB+ \nSe for A+: A+, AB+");
	    }
		else if (tipagemMae.equals("A-") && tipagemPai.equals("A-")) {
	        System.out.println("A-, A+, AB-, AB+");
		}
		else if (tipagemMae.equals("A+") && tipagemPai.equals("A+")) {
	        System.out.println("A+, AB+");
		}

		else if ((tipagemMae.equals("B-") && tipagemPai.equals("B+")) || ((tipagemMae.equals("B+") && tipagemPai.equals("B-")))) {
	        System.out.println("Se for B-: B-, B+, AB-, AB+ \nSe for B+: B+, AB+");
	    }
		else if (tipagemMae.equals("B-") && tipagemPai.equals("B-")) {
	        System.out.println("B-, B+, AB-, AB+");
	    }
		else if (tipagemMae.equals("B+") && tipagemPai.equals("B+")) {
	        System.out.println("B+, AB+");
	    }

		else if ((tipagemMae.equals("AB-") && tipagemPai.equals("AB+")) || ((tipagemMae.equals("AB+") && tipagemPai.equals("AB-")))) {
	        System.out.println("Se for A-: A-, A+, AB- \nSe for A+: A+, AB+ \nSe for B-: B-, B+, AB-, AB+ \nSe for B+: B+, AB+ \nSe for AB-: AB-, AB+ \nSe for AB+: AB+");
        }
		else if (tipagemMae.equals("AB-") && tipagemPai.equals("AB-")) {
	        System.out.println("Se for A-: A-, A+, AB-, AB+ \nSe for B-: B-, B+, AB-, AB+ \nSe for AB-: AB-, AB+");
        }
		else if (tipagemMae.equals("AB+") && tipagemPai.equals("AB+")) {
	        System.out.println("Se for A+: A+, AB+ \nSe for B+: B+, AB+ \nSe for AB+: AB+");
        }

		else if (((tipagemMae.equals("A-") && tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("A-")) || (tipagemMae.equals("A+") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("A+"))))) {
	        System.out.println("Se for A-: A-, A+, AB- \nSe for A+: A+, AB+ \nSe for B-: B-, B+, AB-, AB+ \nSe for B+: B+, AB+ \nSe for AB-: AB-, AB+ \nSe for AB+: AB+");
        }
		else if (((tipagemMae.equals("A+") && (tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("A+"))))) {
	        System.out.println("Se for A-: A-, A+, AB-, AB+ \nSe for B-: B-, B+, AB-, AB+ \nSe for AB-: AB-, AB+");
        }
		else if (((tipagemMae.equals("A-") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("A-"))))) {
	        System.out.println("Se for A+: A+, AB+ \nSe for B+: B+, AB+ \nSe for AB+: AB+");
        }

		else if (((tipagemMae.equals("B-") && tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("B-")) || (tipagemMae.equals("B+") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("B+"))))) {
	        System.out.println("Se for A-: A-, A+, AB- \nSe for A+: A+, AB+ \nSe for B-: B-, B+, AB-, AB+ \nSe for B+: B+, AB+ \nSe for AB-: AB-, AB+ \nSe for AB+: AB+");
        }
		else if (((tipagemMae.equals("B+") && (tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("B+"))))) {
	        System.out.println("Se for A-: A-, A+, AB-, AB+ \nSe for B-: B-, B+, AB-, AB+ \nSe for AB-: AB-, AB+");
        }
		else if (((tipagemMae.equals("B-") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("B-"))))) {
	        System.out.println("Se for A+: A+, AB+ \nSe for B+: B+, AB+ \nSe for AB+: AB+");
        }

		else if (((tipagemMae.equals("B-") && tipagemPai.equals("A+")) || (tipagemMae.equals("A+") && tipagemPai.equals("B-")) || (tipagemMae.equals("B+") && (tipagemPai.equals("A-")) || (tipagemMae.equals("A-") && tipagemPai.equals("B+"))))) {
	        System.out.println("Se for A-: A-, A+, AB- \nSe for A+: A+, AB+ \nSe for B-: B-, B+, AB-, AB+ \nSe for B+: B+, AB+ \nSe for AB-: AB-, AB+ \nSe for AB+: AB+ \nSe for o-: O-, O+, A-, A+, B-, B+, AB-, AB+ \nSe for O+: O+, A+, B+, AB+");
        }
		else if (((tipagemMae.equals("B+") && (tipagemPai.equals("A+")) || (tipagemMae.equals("A+") && tipagemPai.equals("B+"))))) {
			System.out.println("Se for A-: A-, A+, AB-, AB+ \nSe for B-: B-, B+, AB-, AB+ \nSe for AB-: AB-, AB+ \nSe for O-: O-, O+, A-, A+, B-, B+, AB-, AB+");
        }
		else if (((tipagemMae.equals("B-") && (tipagemPai.equals("A-")) || (tipagemMae.equals("A-") && tipagemPai.equals("B-"))))) {
	        System.out.println("Se for A+: A+, AB+ \nSe for B+: B+, AB+ \nSe for AB+: AB+ \nSe for O+: O+, A+, B+, AB+");
        }

		else if (((tipagemMae.equals("O-") && tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("O-")) || (tipagemMae.equals("O+") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("O+"))))) {
	        System.out.println("Se for A-: A-, A+, AB-, AB+ \nSe for A+: A+, AB+ \nSe for B+: B+, AB+ \nSe for B-: B-, B+, AB-, AB+");
        }
		else if (((tipagemMae.equals("O+") && (tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("O+"))))) {
			System.out.println("Se for A+: A+, AB+ \nSe for B+: B+, AB+");
        }
		else if (((tipagemMae.equals("O-") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("O-"))))) {
			System.out.println("Se for A-: A-, A+, AB-, AB+ \nSe for B-: B-, B+, AB-, AB+");
        }

		else if (((tipagemMae.equals("O-") && tipagemPai.equals("A+")) || (tipagemMae.equals("A+") && tipagemPai.equals("O-")) || (tipagemMae.equals("O+") && (tipagemPai.equals("A-")) || (tipagemMae.equals("A-") && tipagemPai.equals("O+"))))) {
	        System.out.println("Se for O-: O-, O+, A-, A+, B-, B+, AB-, AB+ \nSe for O+: O+, A+, B+, AB+ \nSe for A+: A+, AB+ \nSe for A-: A-, A+, AB-, AB+");
        }
		else if (((tipagemMae.equals("O+") && (tipagemPai.equals("A+")) || (tipagemMae.equals("A+") && tipagemPai.equals("O+"))))) {
	        System.out.println("Se for O+: O+, A+, B+, AB+ \nSe for A+: A+, AB+");
        }
		else if (((tipagemMae.equals("O-") && (tipagemPai.equals("A-")) || (tipagemMae.equals("A-") && tipagemPai.equals("O-"))))) {
	        System.out.println("Se for O-: O-, O+, A-, A+, B-, B+, AB-, AB+ \nSe for A-: A-, A+, AB-, AB+");
        }

		else if (((tipagemMae.equals("O-") && tipagemPai.equals("B+")) || (tipagemMae.equals("B+") && tipagemPai.equals("O-")) || (tipagemMae.equals("O+") && (tipagemPai.equals("B-")) || (tipagemMae.equals("B-") && tipagemPai.equals("O+"))))) {
	        System.out.println("Se for O-: O-, O+, A-, A+, B-, B+, AB-, AB+ \nSe for O+: O+, A+, B+, AB+ \nSe for B+: B+, AB+ \nSe for B-: B-, B+, AB-, AB+");
        }
		else if (((tipagemMae.equals("B+") && (tipagemPai.equals("O+")) || (tipagemMae.equals("O+") && tipagemPai.equals("B+"))))) {
	        System.out.println("Se for O+: O+, A+, B+, AB+ \nSe for B+: B+, AB+");
        }
		else if (((tipagemMae.equals("B-") && (tipagemPai.equals("O-")) || (tipagemMae.equals("O-") && tipagemPai.equals("B-"))))) {
	        System.out.println("Se for O-: O-, O+, A-, A+, B-, B+, AB-, AB+ \nSe for B-: B-, B+, AB-, AB+");
        } else {
			System.out.println("Combinação não encontrada!");
		}


		System.out.println("\nA criança pode receber doação de: ");
			
		if ((tipagemMae.equals("O-") && tipagemPai.equals("O+")) || ((tipagemMae.equals("O+") && tipagemPai.equals("O-")))) {
			System.out.println("Se for O-: O- \nSe for O+: O+, O-");
		}
		else if (tipagemMae.equals("O-") && tipagemPai.equals("O-")) {
			System.out.println("O-");
		}
		else if (tipagemMae.equals("O+") && tipagemPai.equals("O+")) {
			System.out.println( "O-, O+");
		}
	
		else if ((tipagemMae.equals("A-") && tipagemPai.equals("A+")) || ((tipagemMae.equals("A+") && tipagemPai.equals("A-")))) {
			System.out.println("Se for A+: A-, O- \nSe for A-: A+, A-, O+, O-");
		}
		else if (tipagemMae.equals("A-") && tipagemPai.equals("A-")) {
			System.out.println("A-, O-");
		}
		else if (tipagemMae.equals("A+") && tipagemPai.equals("A+")) {
			System.out.println("A-, A+, O-, O+");
		}
	
		else if ((tipagemMae.equals("B-") && tipagemPai.equals("B+")) || ((tipagemMae.equals("B+") && tipagemPai.equals("B-")))) {
			System.out.println("Se for B-: B-, O- \nSe for B+: B+, B-, O+, O-");
		}
		else if (tipagemMae.equals("B-") && tipagemPai.equals("B-")) {
			System.out.println("B-, O-");
		}
		else if (tipagemMae.equals("B+") && tipagemPai.equals("B+")) {
			System.out.println("B-, B+, O-, O+");
		}
	
		else if ((tipagemMae.equals("AB-") && tipagemPai.equals("AB+")) || ((tipagemMae.equals("AB+") && tipagemPai.equals("AB-")))) {
			System.out.println("Se for AB-: A-, B-, AB-, O- \nSe for AB+: A-, A+, B-, B+, AB-, AB+, O-, O+");
		}
		else if (tipagemMae.equals("AB-") && tipagemPai.equals("AB-")) {
			System.out.println("Sefor A-: A-, O- \nSe for B-: B-, O- \nSe for AB-: A-, B-, AB-, O-");
		}
		else if (tipagemMae.equals("AB+") && tipagemPai.equals("AB+")) {
			System.out.println("Se for A+: A-, A+, O-, O+ \nSe for B+: B-, B+, O-, O+ \nSefor AB+: A-, A+, B+, B-, AB+, AB-, O+, O-");
		}
	
		else if (((tipagemMae.equals("A-") && tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("A-")) || (tipagemMae.equals("A+") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("A+"))))) {
			System.out.println("Se for A-: A-, O- \nSe for A+: A+, A-, O+, O- \nSe for B-: B-, O- \nSe for B+: B-, B+, O-, O+ \nSe for AB-: A-, B-, AB-, O- \nSe for AB+: A+, A-, B+, B-, AB+, AB-, O+, O-");
		}
		else if (((tipagemMae.equals("A+") && (tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("A+"))))) {
			System.out.println("Se for A+: A+, A-, O+, O- \nSe for B+: B-, B+, O-, O+ \nSe for AB+: A+, A-, B+, B-, AB+, AB-, O+, O-");
		}
		else if (((tipagemMae.equals("A-") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("A-"))))) {
			System.out.println("Se for A-: A-, O- \nSe for B-: B-, O- \nSe for AB-: A-, B-, AB-, O-");
		}


		else if (((tipagemMae.equals("B-") && tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("B-")) || (tipagemMae.equals("B+") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("B+"))))) {
			System.out.println("Se for A-: A-, O- \nSe for A+: A+, A-, O+, O- \nSe for B-: B-, O- \nSe for B+: B-, B+, O-, O+ \nSe for AB-: A-, B-, AB-, O- \nSe for AB+: A+, A-, B+, B-, AB+, AB-, O+, O-");
		}
		else if (((tipagemMae.equals("B+") && (tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("B+"))))) {
			System.out.println("Se for A+: A+, A-, O+, O- \nSe for B+: B-, B+, O-, O+ \nSe for AB+: A+, A-, B+, B-, AB+, AB-, O+, O-");
		}
		else if (((tipagemMae.equals("B-") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("B-"))))) {
			System.out.println("Se for A-: A-, O- \nSe for B-: B-, O- \nSe for AB-: A-, B-, AB-, O-");
		}


		else if (((tipagemMae.equals("A-") && tipagemPai.equals("B+")) || (tipagemMae.equals("B+") && tipagemPai.equals("A-")) || (tipagemMae.equals("A+") && (tipagemPai.equals("B-")) || (tipagemMae.equals("B-") && tipagemPai.equals("A+"))))) {
			System.out.println("Se for A-: A-, O- \nSe for A+: A+, A-, O+, O- \nSe for B-: B-, O- \nSe for B+: B-, B+, O-, O+ \nSe for AB-: A-, B-, AB-, O- \nSe for AB+: A+, A-, B+, B-, AB+, AB-, O+, O- \nSe for O-: O- \nSe for O+: O-, O+");
		}
		else if (((tipagemMae.equals("B+") && (tipagemPai.equals("A+")) || (tipagemMae.equals("A+") && tipagemPai.equals("B+"))))) {
			System.out.println("Se for B+: B-, B+, O-, O+ \nSe for A+: A-, A+, O-, O+ \nSe for AB+: A+, A-, B+, B-, AB+, AB-, O+, O- \nSe for O+: O-, O+");
		}
		else if (((tipagemMae.equals("B-") && (tipagemPai.equals("A-")) || (tipagemMae.equals("A-") && tipagemPai.equals("B-"))))) {
			System.out.println("Se for B-: B-, O- \nSe for A-: A-, AB- \nSe for AB-: A-, B-, AB-, O- \nSe for O-: O-");
		}


		else if (((tipagemMae.equals("O-") && tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("O-")) || (tipagemMae.equals("O+") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("O+"))))) {
			System.out.println("Se for A-: A-, O- \nSe for A+: A-, A+, O-, O+ \nSe for B-: B-, O- \nSe for B+: B-, B+, O-, O+");
		}
		else if (((tipagemMae.equals("O+") && (tipagemPai.equals("AB+")) || (tipagemMae.equals("AB+") && tipagemPai.equals("O+"))))) {
			System.out.println("Se for A+: A-, A+, O-, O+ \nSe for B+: B-, B+, O-, O+");
		}
		else if (((tipagemMae.equals("O-") && (tipagemPai.equals("AB-")) || (tipagemMae.equals("AB-") && tipagemPai.equals("O-"))))) {
			System.out.println("Se for A-: A-, O- \nSe for B-: B-, O-");
		}


		else if (((tipagemMae.equals("O-") && tipagemPai.equals("A+")) || (tipagemMae.equals("A+") && tipagemPai.equals("O-")) || (tipagemMae.equals("O+") && (tipagemPai.equals("A-")) || (tipagemMae.equals("A-") && tipagemPai.equals("O+"))))) {
			System.out.println("Se for O-: O- \nSe for O+: O+, O- \nSe for A-: A-, O- \nSe for A+: A-, A+, O-, O+");
		}
		else if (((tipagemMae.equals("O+") && (tipagemPai.equals("A+")) || (tipagemMae.equals("A+") && tipagemPai.equals("O+"))))) {
			System.out.println("Se for O+: O-, O+ \nSe for A+: A+, A-, O+, O-");
		}
		else if (((tipagemMae.equals("O-") && (tipagemPai.equals("A-")) || (tipagemMae.equals("A-") && tipagemPai.equals("O-"))))) {
			System.out.println("Se for O-: O- \nSe for A-: A-, O-");
		}


		else if (((tipagemMae.equals("O-") && tipagemPai.equals("B+")) || (tipagemMae.equals("B+") && tipagemPai.equals("O-")) || (tipagemMae.equals("O+") && (tipagemPai.equals("B-")) || (tipagemMae.equals("B-") && tipagemPai.equals("O+"))))) {
			System.out.println("Se for O-: O- \nSe for O+: O+, O- \nSe for B-: B-, O- \nSe for B+: B-, B+, O-, O+");
		}
		else if (((tipagemMae.equals("B+") && (tipagemPai.equals("O+")) || (tipagemMae.equals("O+") && tipagemPai.equals("B+"))))) {
			System.out.println("Se for O+: O-, O+ \nSe for B+: B+, B-, O+, O-");
		}
		else if (((tipagemMae.equals("B-") && (tipagemPai.equals("O-")) || (tipagemMae.equals("O-") && tipagemPai.equals("B-"))))) {
			System.out.println("Se for O-: O- \nSe for B-: B-, O-");
		} else {
			System.out.println("Combinação não encontrada!");
		}
	}
}
