package mage.cards.t;

import java.util.UUID;

import mage.abilities.effects.common.CounterTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.target.common.TargetActivatedOrTriggeredAbilityOrLegendarySpell;

/**
 *
 * @author rscoates
 */
public final class TalesEnd extends CardImpl {

    public TalesEnd(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{1}{U}");
        

        // Counter target activated ability, triggered ability, or legendary spell.
        // Counter target activated or triggered ability.
        this.getSpellAbility().addEffect(new CounterTargetEffect());
        this.getSpellAbility().addTarget(new TargetActivatedOrTriggeredAbilityOrLegendarySpell());
    }

    private TalesEnd(final TalesEnd card) {
        super(card);
    }

    @Override
    public TalesEnd copy() {
        return new TalesEnd(this);
    }
}
