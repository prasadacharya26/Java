package com.wolken.wolkenassessment.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.TypeMismatchException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenassessment.dto.TicketDTO;
import com.wolken.wolkenassessment.entity.TicketEntity;
import com.wolken.wolkenassessment.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	TicketRepository ticketRepository;
	SimpleDateFormat date=new SimpleDateFormat("dd/MM/yyyy");
	@Override
	public String validateAndAddTicket(TicketDTO ticketDTO)throws ParseException {
		try {
			if(!ticketDTO.getAgentId().equals(null) && !ticketDTO.getAgentId().equals("")) {
				logger.info(""+ticketDTO);
				if(!ticketDTO.getRequestType().equals(null) && !ticketDTO.getRequestType().equals("")) {
					if(!ticketDTO.getIssue().equals(null) && !ticketDTO.getIssue().equals("")) {
						if(!ticketDTO.getDate().equals(null) && !ticketDTO.getDate().equals("")) {
							if(!ticketDTO.getUrgency().equals(null) && !ticketDTO.getUrgency().equals("")) {
								if(ticketDTO.getUrgency().equals("urgent") || ticketDTO.getUrgency().equals("medium") || ticketDTO.getUrgency().equals("low")) {
									if(!ticketDTO.getStatus().equals(null) && !ticketDTO.getStatus().equals("")) {
										if(!ticketDTO.getAssignedTo().equals(null) && !ticketDTO.getAssignedTo().equals("")) {
											if(ticketDTO.getCustomerId()!=0) {
												
												TicketEntity ticketEntity = new TicketEntity();
												Date addDate = new SimpleDateFormat("dd/MM/yyyy").parse(ticketDTO.getDate());
												ticketEntity.setDate(addDate);
												BeanUtils.copyProperties(ticketDTO, ticketEntity);
												ticketRepository.save(ticketEntity);
												logger.info("Ticket saved");
												return "Ticket saved";
											}else {
												logger.info("Invalid customer id");
												return "Invalid customer id";
											}
										}else {
											logger.info("Invalid assigned to");
											return "Invalid assigned to";
										}
									}else {
										logger.info("Invalid status");
										return "Invalid status";
									}
								}else {
									logger.info("Invalid urgency");
									return "Invalid urgency";
								}
							}else {
								logger.info("Invalid urgency");
								return "Invalid urgency";
							}
						}else {
							logger.info("Invalid date");
							return "Invalid date";
						}
					}else {
						logger.info("Invalid issue");
						return "Invalid issue";
					}
				}else {
					logger.info("Invalid request type");
					return "Invalid request type";
				}
			}else {
				logger.info("Invalid agent id");
				return "Invalid agent id";
			}
		} catch (NullPointerException | TypeMismatchException e) {
			logger.info(e.getMessage(),e.getClass().getSimpleName());
		}
		return null;
	}

	@Override
	public List<TicketDTO> validateAndGetAll() {
		List<TicketDTO> ticketDTOs = new ArrayList<TicketDTO>();
		try {
			List<TicketEntity> ticketEntities = ticketRepository.findAll();
			TicketDTO ticketDTO = new TicketDTO();
			for (TicketEntity ticketEntity : ticketEntities) {
				BeanUtils.copyProperties(ticketEntity, ticketDTO);
				ticketDTO.setDate(date.format(ticketEntity.getDate()));
				ticketDTOs.add(ticketDTO);
			}
			logger.info(""+ticketDTOs);
		} catch (NullPointerException | TypeMismatchException e) {
			logger.error(e.getMessage(),e.getClass().getSimpleName());
		}
		return ticketDTOs;
	}


	@Override
	public String updateTicketById(TicketDTO ticketDTO) throws ParseException {
		try {
			TicketEntity ticketEntity = ticketRepository.findById(ticketDTO.getTicketId());
			if(ticketEntity!=null) {
				if(ticketDTO.getAgentId()!=null) {
					ticketEntity.setAgentId(ticketDTO.getAgentId());
				}
				if(ticketDTO.getRequestType()!=null) {
					ticketEntity.setRequestType(ticketDTO.getRequestType());
				}
				if(ticketDTO.getIssue()!=null) {
					ticketEntity.setIssue(ticketDTO.getIssue());
				}
				if(ticketDTO.getDate()!=null) {
					Date addDate = new SimpleDateFormat("dd/MM/yyyy").parse(ticketDTO.getDate());
					ticketEntity.setDate(addDate);
				}
				if(ticketDTO.getUrgency()!=null) {
					ticketEntity.setUrgency(ticketDTO.getUrgency());
				}
				if(ticketDTO.getStatus()!=null) {
					ticketEntity.setStatus(ticketDTO.getStatus());
				}
				if(ticketDTO.getAssignedTo()!=null) {
					ticketEntity.setAssignedTo(ticketDTO.getAssignedTo());
				}
				if(ticketDTO.getCustomerId()!=0) {
					ticketEntity.setCustomerId(ticketDTO.getCustomerId())
				}
				ticketRepository.save(ticketEntity);
				logger.info("Data updated");
				return "Data updated";
			}else {
				logger.info("Id not found");
				return "Id not found";
			}
		} catch (NullPointerException | TypeMismatchException e) {
			logger.error(e.getMessage(),e.getClass().getSimpleName());
		}
		return null;
	}

}
