package ZCW.Api.Practice.Hearthstone.repositories;

import ZCW.Api.Practice.Hearthstone.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CardRepository extends JpaRepository<HearthCard, Long> {}
