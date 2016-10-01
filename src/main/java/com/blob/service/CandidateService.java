package com.blob.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blob.dao.CandidateDao;
import com.blob.enums.StatusEnum;
import com.blob.model.Candidate;
import com.blob.model.User;
import com.blob.util.DateUtils;
import com.blob.util.GUtils;

@Service
public class CandidateService {
	
	@Resource
	private GUtils gutils;
	
	@Resource
	private CandidateDao candidateDao;

	public Candidate getCandidateByUser(User user){
	
		Candidate c = null;
		List<Candidate> candidates = user.getCandidates();
		if(candidates != null && !candidates.isEmpty())
			c = candidates.get(0);
		return c;
	}
	
	public Boolean isCandidate(User user){
		
		Boolean c = false;
		List<Candidate> candidates = user.getCandidates();
		if(candidates != null && !candidates.isEmpty())
			c = true;
		return c;
	}
	
	public Candidate registerAsCandidate(User user){
		
		Candidate c = null;
		List<Candidate> candidates = user.getCandidates();
		if(candidates == null || candidates.isEmpty()){
			c = new Candidate();
			c.setUser(user);
			c.setGid(gutils.generateGid());
			c.setStatus(StatusEnum.Active.toString());
			c.setCreateOn(DateUtils.toDate(LocalDateTime.now()));
			c.setUpdateOn(DateUtils.toDate(LocalDateTime.now()));
			c = candidateDao.save(c);
		}
		return c;
	}
}
