import com.moneysupermarket.bowling.model.Game;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: sully.rafiq
 * Date: 09/01/2014
 * Time: 13:40
 * To change this template use File | Settings | File Templates.
 */
public class GameTest {

    private Game game;

    @Test
    public void gameShouldHave10Frames() {
        whenIHaveAGame();
        thenItShouldHave10Frames();
    }

    @Test
    public void aNewGameShouldHaveAScoreOfZero() {
        whenIHaveAGame();
        thenIShouldHaveAScoreOf(0);
    }

    @Test
    public void gameScoreShouldBe10WhenIDoOneStrike() {
        whenIHaveAGame();
        andIRollWithPinsKnocked(10);
        thenIShouldHaveAScoreOf(10);
    }

    @Test
    public void gameScoreShouldBe9WhenIDoTwoRolls() {
        whenIHaveAGame();
        andIRollWithPinsKnocked(4);
        andIRollWithPinsKnocked(5);
        thenIShouldHaveAScoreOf(9);
    }

    @Test
    public void shouldBeOnFrame3After4RollsWithNoStrikes() {
        whenIHaveAGame();
        andIRollWithPinsKnocked(4);
        andIRollWithPinsKnocked(5);
        andIRollWithPinsKnocked(3);
        andIRollWithPinsKnocked(2);
        thenIShouldBeOnFrame(3);
    }

    @Test
    public void aStrikeShouldCompleteAFrame() {
        whenIHaveAGame();
        andIRollWithPinsKnocked(10);
        thenIShouldBeOnFrame(2);
    }

    @Test
    public void aSpareShouldEqual10PlusScoreFromNextRoll() {
        whenIHaveAGame();
        andIRollWithPinsKnocked(6);
        andIRollWithPinsKnocked(4);
        andIRollWithPinsKnocked(7);
        andIRollWithPinsKnocked(6);
        thenIShouldHaveAScoreOf(30);
    }

    @Test
    public void aStrikeShouldEqual10PlusScoreFromNext2Rolls() {
        whenIHaveAGame();
        andIRollWithPinsKnocked(10);
        andIRollWithPinsKnocked(3);
        andIRollWithPinsKnocked(4);
        thenIShouldHaveAScoreOf(24);
    }

    @Test
    public void finalFrameCanHave3RollsIfSpareInFinalFrame() {
        whenIHaveAGame();
        andIGetToFrame(10);

        andIRollWithPinsKnocked(6);
        andIRollWithPinsKnocked(4);
        andIRollWithPinsKnocked(3);

        thenTheScoreOfTheFrameShouldBe(10, 13);
    }

    @Test
    public void finalFrameCanHave3RollsIfStrikeInFinalFrame() {
        whenIHaveAGame();
        andIGetToFrame(10);

        andIRollWithPinsKnocked(10);
        andIRollWithPinsKnocked(10);
        andIRollWithPinsKnocked(10);

        thenTheScoreOfTheFrameShouldBe(10, 30);
    }

    @Test
    public void perfectGameHasScoreOf300() {
        whenIHaveAGame();
        andIHaveAPerfectGame();
        thenIShouldHaveAScoreOf(300);
    }


    private void whenIHaveAGame() {
        game = new Game();
    }

    private void thenItShouldHave10Frames() {
        Assert.assertEquals(10, game.getNumberOfFrames());
    }

    private void thenIShouldBeOnFrame(int frameNo) {
        Assert.assertEquals(frameNo, game.getFrameNo());
    }

    private void thenIShouldHaveAScoreOf(int score) {
        Assert.assertEquals(score, game.getScore());
    }

    private void thenTheScoreOfTheFrameShouldBe(int frameNo, int frameScore) {
        int frameIndex = frameNo - 1;
        org.junit.Assert.assertEquals(frameScore, game.getFrameScore(frameIndex));
    }

    private void andIRollWithPinsKnocked(int pins) {
        game.roll(pins);
    }

    private void andIGetToFrame(int frameNo) {
        for(int i=0; i < frameNo - 1; i++) {
            andIRollWithPinsKnocked(5);
            andIRollWithPinsKnocked(5);
        }
    }

    private void andIHaveAPerfectGame() {
        for(int i=0; i < 12; i++) {
            andIRollWithPinsKnocked(10);
        }
    }
}
