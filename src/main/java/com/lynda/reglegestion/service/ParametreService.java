package com.lynda.reglegestion.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.lynda.reglegestion.dto.ParametreTransaction;

@Service
public class ParametreService {
	
	public String channelRule(ParametreTransaction request) {
		if(request==null||request.getCategorieRecever()==null||request.getCategorieRecever().isBlank()) {
			return"donnée invalidé";
		}
		
		if("paiement".equals(request.getTypeTransaction())) {
			if("P".equals(request.getCategorieSender())) {
				if("P".equals(request.getCategorieRecever())) {
					if("QR".equals(request.getPaymentType())) {
						return "731";
					} 
					else if(List.of("ALIAS", "OTHER_ACCOUNT", "IBAN").contains(request.getPaymentType())) {
						return "633";
					}
					else if(request.getPaymentType().startsWith("USSD")) {
						return "300";
					}
					else return "IMPOSSIBLE";
				}
				else {
					if("QR".equals(request.getPaymentType())) {
						return "000";
					} 
					else if("QRDYN".equals(request.getPaymentType())) {
						return "400";
					}
					else if(List.of("ALIAS", "OTHER_ACCOUNT", "IBAN").contains(request.getPaymentType())) {
						return "999";
					}
					else if(request.getPaymentType().startsWith("USSD")) {
						return "300";
					}
					else return "IMPOSSIBLE";
				}
			}
			
			
			
			else if(request.getCategorieSender().equals("C")) {
				if(request.getCategorieRecever().equals("P")) {
				if(request.getPaymentType().equals("QR")) {
					return"731";
				}
				else if(List.of("ALIAS", "OTHER_ACCOUNT", "IBAN").contains(request.getPaymentType())) {
					return"633";
				}
				else if(request.getPaymentType().startsWith("USSD")) {
					return"300";
				}
				else {
					return"IMPOSSIBLE";
				}
				}
				else 
					if(request.getPaymentType().equals("QR")) {
						return "000";
					}
					else if(request.getPaymentType().equals("QRDYN")) {
						return"400";
					}
					else if(List.of("ALIAS", "OTHER_ACCOUNT", "IBAN").contains(request.getPaymentType())) {
						return"999";
					}
					else if(request.getPaymentType().startsWith("USSD")) {
						return"300";
					}
					else {
						return"IMPOSSIBLE";
					}
				
				}
			
			else 
				if(request.getCategorieSender().equals("B")) {
					if(request.getCategorieRecever().equals("P"))
						if(request.getPaymentType().equals("OTHER_ACCOUNT")) {
							return"633";
						}
						else if(request.getPaymentType().startsWith("USSD")) {
							return"300";
						}
						else if(request.getPaymentType().equals("QR")) {
							return"000";
						}
						else if(List.of("ALIAS", "OTHER_ACCOUNT", "IBAN").contains(request.getPaymentType())) {
							return"999";
						}
						else {
							return"IMPOSSIBLE";
						}
							
					
					else 
						if(request.getPaymentType().equals("QR")) {
							return"000";
						}
						else if(request.getPaymentType().equals("QRDYN")) {
							return"400";
						}
						else if(List.of("ALIAS", "OTHER_ACCOUNT", "IBAN").contains(request.getPaymentType())) {
							return"999";
						}
						else if(request.getPaymentType().startsWith("USSD")) {
							return"300";
						}
						else {
							return"IMPOSSIBLE";
						}
					
				}
			
				else 
					if(request.getCategorieSender().equals("G")) {
						if(request.getCategorieRecever().equals("P"))
							if(request.getPaymentType().equals("QR")) {
								return"000";
							}
							else if(request.getPaymentType().startsWith("USSD")) {
								return"300";
							}
							else if(List.of("ALIAS", "OTHER_ACCOUNT", "IBAN").contains(request.getPaymentType())) {
								return"999";
							}
							else {
								return"IMPOSSIBLE";
							}
						
						else
							if(request.getPaymentType().equals("QR")) {
								return"000";
							}
							else if(request.getPaymentType().equals("QRDYN")) {
								return"400";
							}
							else if(List.of("ALIAS", "OTHER_ACCOUNT", "IBAN").contains(request.getPaymentType())) {
								return"999";
							}
							else if(request.getPaymentType().startsWith("USSD")) {
								return"300";
							}
							else {
								return"IMPOSSIBLE";
							}
						
					}
			
			
		}	
		
		
			
			
			
			
	//DEMANDE DE PAIEMENT
		
		if("demande de paiement".equals(request.getTypeTransaction())) {
			if("P".equals(request.getCategorieSender())) {
				if("P".equals(request.getCategorieRecever())) {
					if("provenant d'un particulier".equals(request.getPaymentType())) {
						return"631";
					}
					else {
						return "IMPOSSIBLE";
					}
					  
				}
				else
					if("marchand sur site".equals(request.getPaymentType())) {
						return"500";
					}
					else if("e-commerce imediat".equals(request.getPaymentType())) {
						return"521";
					}
					else if("e-commerce a la livraison".equals(request.getPaymentType())) {
						return"520";
					}
					else if("autre demande".equals(request.getPaymentType())) {
						return"401";
					}
					else {
						return "IMPOSSIBLE";
					}
				
			}
			
			else 
				if("B".equals(request.getCategorieSender())) {
					if("P".equals(request.getCategorieRecever())){
						if("provenant d'un particulier".equals(request.getPaymentType())) {
							return"631";
						}
						else {
							return"IMPOSSIBLE";
						}
					}
					else
						if("marchand sur site".equals(request.getPaymentType())) {
							return"500";
						}
						else if("e-commerce imediat".equals(request.getPaymentType())) {
							return"521";
						}
						else if("e-commerce a la livraison".equals(request.getPaymentType())) {
							return"520";
						}
						else if("autre demande".equals(request.getPaymentType())) {
							return"401";
						}
						else {
							return "IMPOSSIBLE";
						}
					
				}
			
			
				else 
					if("G".equals(request.getCategorieSender())) {
						if("P".equals(request.getCategorieRecever())) {
							if("provenant d'un particulier".equals(request.getPaymentType())) {
								return"631";
							}
							else {
								return"IMPOSSIBLE";
							}
						}
						else
							if("marchand sur site".equals(request.getPaymentType())) {
								return"500";
							}
							else if("e-commerce imediat".equals(request.getPaymentType())) {
								return"521";
							}
							else if("e-commerce a la livraison".equals(request.getPaymentType())) {
								return"520";
							}
							else if("autre demande".equals(request.getPaymentType())) {
								return"401";
							}
							else {
								return "IMPOSSIBLE";
							}
						
					}
			
			
					else 
						if("C".equals(request.getCategorieSender())) {
							if("P".equals(request.getCategorieRecever())) {
								if("provenant d'un particulier".equals(request.getPaymentType())) {
									return"631";
								}
								else {
									return"IMPOSSIBLE";
								}
							}
							else
								if("marchand sur site".equals(request.getPaymentType())) {
									return"500";
								}
								else if("e-commerce imediat".equals(request.getPaymentType())) {
									return"521";
								}
								else if("e-commerce a la livraison".equals(request.getPaymentType())) {
									return"520";
								}
								else if("autre demande".equals(request.getPaymentType())) {
									return"401";
								}
								else {
									return "IMPOSSIBLE";
								}
							
						}
			
			
		}
			
	
		return 	"ECHEC";
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	