package com.lynda.reglegestion.service;

import org.springframework.stereotype.Service;


import com.lynda.reglegestion.dto.ParametreTransaction;

@Service
public class ParametreService {
	
	
	
	
	public String transactionCodeQr(ParametreTransaction dto) {
		//on commence par initialisé les objets en leur attribuant une valeur fixe
		/**si c'est un paiement par QR code et que la personne qui effectue le transfert et la personne qui 
		 * reçoit le transfert sont de la mm cartegorie(P&P) alors return 731.
		 */
		
		if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "731";
		}
		else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "731";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
	
		return "Echec";
	}
	
	
	public String canalUssd(ParametreTransaction dto) {
		
		
		if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "300";
		}
		else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "300";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "300";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "300";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "300";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "300";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "300";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "300";}
		
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "300";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "300";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "300";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "300";}
		
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "300";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "300";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "300";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "300";}
		
        else {
        	return "Echec";
        }
		
		
		
	}
	
	
	public String transactionAlias(ParametreTransaction dto) {
		
		if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "633";
		}
		else if("transfert".equals(dto.getTypeTransaction())&& "P".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "633";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&& "B".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
        else if("paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
        else if("transfert".equals(dto.getTypeTransaction())&& "C".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "633";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
		
        else {
        	return "Echec";
        }
		
	}
	
	
	public String transfertCodeQrDynamique(ParametreTransaction dto) {
		
		if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "400";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "400";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "400";}
		
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "400";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "400";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "400";}
		
		
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "400";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "400";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "400";}
		
		
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			
			return "pas de paiement";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
			
			return "400";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "400";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "400";}
		
        
        	return "Echec";
        
		
	}
	
	
	public String transfertBancaire(ParametreTransaction dto) {
		
		if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "999";
		}
		else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "999";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "999";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "999";}
		
		
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "999";
		}
		else if("transfert".equals(dto.getTypeTransaction())&& "B".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "999";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "999";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "999";}
		
		
		
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "999";
		}
		else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "999";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "999";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "999";}
		
		
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "999";
		}
		else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "999";}
		
		else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "999";}
        else if("transfert".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "999";}
		
		
        else {
        	return "Echec";
        }
	}
	
	
	//DEMANDE DE PAIEMENT
	
	public String paiementMarchandSite(ParametreTransaction dto) {
		
		if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "P".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "500";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "500";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "500";}
		
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "500";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "B".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "500";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "500";}
		
        else if("Demande de paiement".equals(dto.getTypeTransaction())&& "G".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "500";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "500";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "500";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "500";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "500";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "500";}
        else {
        	return "Echec";
        }
	}
	
	
	public String paiementECommerce(ParametreTransaction dto) {
		
		if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "P".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "521";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "521";}
		
        else if("Demande de paiement".equals(dto.getTypeTransaction())&& "B".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "B".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "521";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
			return "521";}
		
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
    			return "pas de transaction";
    		}
    		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
    				
    			return "pas de transaction";}
    		
    		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
    			
    			return "521";}
            else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
    			
    			return "521";}
		
            else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
    			return "pas de transaction";
    		}
    		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "C".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
    				
    			return "pas de transaction";}
    		
    		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
    			
    			return "521";}
            else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
    			
    			return "521";}
		
            else {
            	return "Echec";
            }
	}
	
	
	public String paiementECommerceLivraison(ParametreTransaction dto) {

			
			if("Demande de paiement".equals(dto.getTypeTransaction())&& "P".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
				return "pas de transaction";
			}
			else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
					
				return "pas de transaction";}
			
			else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
				
				return "520";}
	        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
				
				return "520";}
			
	        else if("Demande de paiement".equals(dto.getTypeTransaction())&& "B".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
				return "pas de transaction";
			}
			else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
					
				return "pas de transaction";}
			
			else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
				
				return "520";}
	        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
				
				return "520";}
			
	        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
	    			return "pas de transaction";
	    		}
	    		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "G".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
	    				
	    			return "pas de transaction";}
	    		
	    		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
	    			
	    			return "520";}
	            else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
	    			
	    			return "520";}
			
	            else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
	    			return "pas de transaction";
	    		}
	    		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "C".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
	    				
	    			return "pas de transaction";}
	    		
	    		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
	    			
	    			return "520";}
	            else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
	    			
	    			return "520";}
			
	            else {
	            	return "Echec";
	            }
	}
	
	public String paiementParticulier(ParametreTransaction dto) {
		
		if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "631";
		}
		else if(" Demande depaiement".equals(dto.getTypeTransaction())&& "P".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if(" Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if(" Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
        	return "pas de transaction";}
		
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "631";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if(" Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
        	return "pas de transaction";}
		
        else if(" Demande de paiement".equals(dto.getTypeTransaction())&& "G".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "631";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "G".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if(" Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if(" Demande de paiement".equals(dto.getTypeTransaction())&& "G".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
        	return "pas de transaction";}
		
        else if(" Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "631";
		}
		else if(" Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if(" Demande de paiement".equals(dto.getTypeTransaction())&& "C".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "pas de transaction";}
        else if(" Demande de paiement".equals(dto.getTypeTransaction())&& "C".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
        	return "pas de transaction";}
        else {
    		return "Echec";
    	}
	}
	
	
	public String autreDemandePaiement(ParametreTransaction dto) {
		
		if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "P".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "401";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "P".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
        	return "401";}
		
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "401";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "B".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
        	return "401";}
		
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "G".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "G".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "G".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "401";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&& "G".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
        	return "401";}
		
        else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "P".equals(dto.getCategorieRecever())) {
			return "pas de transaction";
		}
		else if("Demande de paiement".equals(dto.getTypeTransaction())&&  "C".equals(dto.getCategorieSender())&& "C".equals(dto.getCategorieRecever())) {
				
			return "pas de transaction";}
		
		else if("Demande de paiement".equals(dto.getTypeTransaction())&& "C".equals(dto.getCategorieSender())&& "B".equals(dto.getCategorieRecever())) {
			
			return "401";}
        else if("Demande de paiement".equals(dto.getTypeTransaction())&& "C".equals(dto.getCategorieSender())&& "G".equals(dto.getCategorieRecever())) {
			
        	return "401";}
		
		
        else {
        	return "Echec";
        }
	}
	
}
