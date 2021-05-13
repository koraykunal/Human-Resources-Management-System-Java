package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.entities.concrete.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
