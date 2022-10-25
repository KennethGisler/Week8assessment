package week8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import week8.beans.Player;
/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Oct 24, 2022
 */
public interface ContactRepository extends JpaRepository<Player,Long> { }
