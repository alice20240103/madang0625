package com.example.madang.dao;

import com.example.madang.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDAO extends JpaRepository<Member, Integer> {
}
