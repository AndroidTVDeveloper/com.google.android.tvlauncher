package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.tvlauncher.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: cjq  reason: default package */
/* compiled from: PG */
public final class cjq {
    public static final List a = Arrays.asList("FAMILY_KIDS", "SPORTS", "SHOPPING", "MOVIES", "COMEDY", "TRAVEL", "DRAMA", "EDUCATION", "ANIMAL_WILDLIFE", "NEWS", "GAMING", "ARTS", "ENTERTAINMENT", "LIFE_STYLE", "MUSIC", "PREMIER", "TECH_SCIENCE");
    public final String[] b;
    public final String[] c;

    public cjq(Context context) {
        Resources resources = context.getResources();
        String[] stringArray = resources.getStringArray(R.array.genre_labels);
        this.b = stringArray;
        if (stringArray.length == a.size()) {
            this.c = resources.getStringArray(R.array.program_canonical_genre_labels_formats);
            return;
        }
        throw new IllegalArgumentException("Canonical genre data mismatch");
    }
}
