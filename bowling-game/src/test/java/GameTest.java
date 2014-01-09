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

    @Test
    public void gameShouldHave10Frames() {
        whenIHaveAGame();
        itShouldHave10Frames();
    }

    @Test
    public void aNewGameShouldHaveAScoreOfZero() {
        whenIHaveAGame();
        iShouldHaveAScoreOf(0);
    }

    @Test
    public void gameScoreShouldBe10WhenIDoOneStrike() {
        whenIHaveAGame();
        andIRollWithPinsKnocked(10);
        iShouldHaveAScoreOf(10);
    }

    @Test
    public void gameScoreShouldBe9WhenIDoTwoRolls() {
        whenIHaveAGame();
        andIRollWithPinsKnocked(4);
        andIRollWithPinsKnocked(5);
        iShouldHaveAScoreOf(9);
    }

    @Test
    public void shouldBeOnFrame3After4Rolls() {
        whenIHaveAGame();
        andIRollWithPinsKnocked(4);
        andIRollWithPinsKnocked(5);
        andIRollWithPinsKnocked(3);
        andIRollWithPinsKnocked(2);
        iShouldBeOnFrame(3);
    }

    private Game game;

    private void whenIHaveAGame() {
        game = new Game();
    }

    private void itShouldHave10Frames() {
        Assert.assertEquals(10, game.getNumberOfFrames());
    }

    private void iShouldHaveAScoreOf(int score) {
        Assert.assertEquals(score, game.getScore());
    }

    private void andIRollWithPinsKnocked(int pins) {
        game.roll(pins);
    }
}
