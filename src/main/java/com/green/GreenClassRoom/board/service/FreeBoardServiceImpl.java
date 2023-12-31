package com.green.GreenClassRoom.board.service;

import com.green.GreenClassRoom.board.vo.FreeBoardVO;
import com.green.GreenClassRoom.board.vo.FreeBookMarkVO;
import com.green.GreenClassRoom.board.vo.ReplyVO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FreeBoardServiceImpl implements FreeBoardService{
    private final SqlSessionTemplate sqlSession;

    @Override
    public List<FreeBoardVO> selectFreeBoardList(FreeBoardVO freeBoardVO) {
        return sqlSession.selectList("freeBoardMapper.selectFreeBoardList",freeBoardVO);
    }

    @Override
    public int insertFreeBoard(FreeBoardVO freeBoardVO) {
        return sqlSession.insert("freeBoardMapper.insertFreeBoard",freeBoardVO);
    }

    @Override
    public FreeBoardVO selectFreeBoardDetail(int boardNum) {
        return sqlSession.selectOne("freeBoardMapper.selectFreeBoardDetail",boardNum);
    }

    @Override
    public int readCntUp(int boardNum) {
        return sqlSession.update("freeBoardMapper.readCntUp",boardNum);
    }

    @Override
    public int updateFreeBoard(FreeBoardVO freeBoardVO) {
        return sqlSession.update("freeBoardMapper.updateFreeBoard",freeBoardVO);
    }

    @Override
    public int deleteFreeBoard(int boardNum) {
        return sqlSession.delete("freeBoardMapper.deleteFreeBoard",boardNum);
    }

    @Override
    public int insertReply(ReplyVO replyVO) {
        return sqlSession.insert("freeBoardMapper.insertReply",replyVO);
    }

    @Override
    public List<ReplyVO> selectReply(ReplyVO replyVO) {
        return sqlSession.selectList("freeBoardMapper.selectReply",replyVO);
    }

    @Override
    public int deleteReply(int replyNum) {
        return sqlSession.delete("freeBoardMapper.deleteReply",replyNum);
    }

    @Override
    public int pagingFreeBoard() {
        return sqlSession.selectOne("freeBoardMapper.pagingFreeBoard");
    }

    @Override
    public int totalReply(int boardNum) {
        return sqlSession.selectOne("freeBoardMapper.totalReply", boardNum);
    }

    @Override
    public FreeBookMarkVO selectInsertFreeBookMark(FreeBookMarkVO freeBookMarkVO) {
        return sqlSession.selectOne("freeBoardMapper.selectInsertFreeBookMark", freeBookMarkVO);
    }

    @Override
    public int updateFreeReplyCnt(FreeBoardVO freeBoardVO) {
        return sqlSession.update("freeBoardMapper.updateFreeReplyCnt", freeBoardVO);
    }
}
