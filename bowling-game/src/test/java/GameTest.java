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
    public void shouldBeOnFrame3After4Rolls() {
        whenIHaveAGame();
        andIRollWithPinsKnocked(4);
        andIRollWithPinsKnocked(5);
        andIRollWithPinsKnocked(3);
        andIRollWithPinsKnocked(2);
        thenIShouldBeOnFrame(3);
    }

    private void whenIHaveAGame() {
        game = new Game();
    }

    private void thenItShouldHave10Frames() {
        Assert.assertEquals(10, game.getNumberOfFrames());
    }

    private void thenIShouldHaveAScoreOf(int score) {
        Assert.assertEquals(score, game.getScore());
    }

    private void andIRollWithPinsKnocked(int pins) {
        game.roll(pins);
    }

    private void thenIShouldBeOnFrame(int frameNo) {
        Assert.fail(); // TEMPORARY!! Done to make the test fail. Remove and replace with something appropriate
    }
}
