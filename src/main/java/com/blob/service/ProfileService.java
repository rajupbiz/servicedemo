package com.blob.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blob.dao.CandidateAddressDao;
import com.blob.dao.CandidateContactDao;
import com.blob.model.Candidate;
import com.blob.model.CandidateAddress;
import com.blob.model.CandidateContact;

@Service
public class ProfileService {
	
	@Resource
	private CandidateContactDao candidateContactDao;
	
	@Resource
	private CandidateAddressDao candidateAddressDao;

	public List<CandidateContact> saveCandidateContacts(List<CandidateContact> contacts, Candidate c){

		List<CandidateContact> resp = new ArrayList<>();
		if(contacts != null && !contacts.isEmpty()){
			for (CandidateContact candidateContact : contacts) {
				candidateContact.setCandidate(c);
				CandidateContact savedContact = candidateContactDao.save(candidateContact);
				resp.add(savedContact);
			}
		}
		return resp;
	}
	
	public List<CandidateAddress> saveCandidateAddress(List<CandidateAddress> addresses, Candidate c){
		
		List<CandidateAddress> resp = new ArrayList<>();
		if(addresses != null && !addresses.isEmpty()){
			for (CandidateAddress address : addresses) {
				address.setCandidate(c);
				CandidateAddress savedAddress = candidateAddressDao.save(address);
				resp.add(savedAddress);
			}
		}
		return resp;
	}
}
