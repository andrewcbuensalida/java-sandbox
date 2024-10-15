// https://leetcode.com/problems/unique-email-addresses/description/

import java.util.HashSet;
import java.util.Set;

class Solution {
  public static void main(String[] args) {
    Solution sol = new Solution();
    final int answer = sol.numUniqueEmails(new String[] { "linqmafia@leet+code.com", "linqmafia@code.com" });
    System.out.println(answer);
  }

  public int numUniqueEmails(String[] emails) {
    Set<String> cleanUniqueEmails = new HashSet<>();
    // loop through emails
    for (int i = 0; i < emails.length; i++) {
      String email = emails[i];
      int indexOfAt = email.indexOf('@');
      int indexOfPlus = email.indexOf('+');
      // split into local and domain
      String local = email.substring(0, indexOfAt);
      String domain = email.substring(indexOfAt);
      String localNoFilter = local;
      // if there's a + before the @, remove filter from local
      if (indexOfPlus != -1 && indexOfPlus < indexOfAt) {
        localNoFilter = local.substring(0, indexOfPlus);
      }
      // remove dots from local
      String localNoDots = localNoFilter.replace(".", "");
      // join local and domain
      String cleanEmail = localNoDots + domain;
      // add to set
      cleanUniqueEmails.add(cleanEmail);

    }
    // return size of set
    return cleanUniqueEmails.size();
  }
}
