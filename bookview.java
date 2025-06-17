public class bookview {
    static class Book {
        String aisle;
        int row;
        int column;
        int id;
        String title;
        String author;

        Book(String aisle, int row, int column, int id, String title, String author) {
            this.aisle = aisle;
            this.row = row;
            this.column = column;
            this.id = id;
            this.title = title;
            this.author = author;
        }//send help
    }
    static Book[] books = {
        // Fiction Aisle
        new Book("A1", 1, 2, 14521, "The Fellowship of the Ring", "J.R.R. Tolkien"),
        new Book("A1", 1, 3, 14522, "The Two Towers", "J.R.R. Tolkien"),
        new Book("A1", 1, 4, 14523, "The Return of the King", "J.R.R. Tolkien"),
        new Book("A1", 2, 5, 14524, "A Game of Thrones", "George R.R. Martin"),
        new Book("A1", 2, 6, 14525, "A Clash of Kings", "George R.R. Martin"),
        new Book("A1", 2, 7, 14526, "A Storm of Swords", "George R.R. Martin"),
        new Book("A1", 2, 8, 14527, "A Feast for Crows", "George R.R. Martin"),
        new Book("A1", 2, 9, 14528, "A Dance with Dragons", "George R.R. Martin"),
        new Book("A1", 3, 10, 14529, "The Name of the Wind", "Patrick Rothfuss"),
        new Book("A1", 3, 11, 14530, "The Wise Man's Fear", "Patrick Rothfuss"),
        new Book("A1", 3, 12, 14531, "Mistborn: The Final Empire", "Brandon Sanderson"),
        new Book("A1", 3, 13, 14532, "The Well of Ascension", "Brandon Sanderson"),
        new Book("A1", 3, 14, 14533, "The Hero of Ages", "Brandon Sanderson"),
        new Book("A1", 3, 15, 14534, "The Way of Kings", "Brandon Sanderson"),
        new Book("A1", 3, 16, 14535, "Words of Radiance", "Brandon Sanderson"),
        new Book("A1", 3, 17, 14536, "Oathbringer", "Brandon Sanderson"),
        new Book("A1", 3, 18, 14537, "Rhythm of War", "Brandon Sanderson"),
        new Book("A1", 4, 19, 14538, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
        new Book("A1", 4, 20, 14539, "Harry Potter and the Chamber of Secrets", "J.K. Rowling"),
        new Book("A1", 4, 21, 14540, "Harry Potter and the Prisoner of Azkaban", "J.K. Rowling"),
        new Book("A1", 4, 22, 14541, "Harry Potter and the Goblet of Fire", "J.K. Rowling"),
        new Book("A1", 4, 23, 14542, "Harry Potter and the Order of the Phoenix", "J.K. Rowling"),
        new Book("A1", 4, 24, 14543, "Harry Potter and the Half-Blood Prince", "J.K. Rowling"),
        new Book("A1", 4, 25, 14544, "Harry Potter and the Deathly Hallows", "J.K. Rowling"),
        new Book("A1", 5, 26, 14545, "The Lion, the Witch and the Wardrobe", "C.S. Lewis"),
        new Book("A1", 5, 27, 14546, "Prince Caspian", "C.S. Lewis"),
        new Book("A1", 5, 28, 14547, "The Voyage of the Dawn Treader", "C.S. Lewis"),
        new Book("A1", 5, 29, 14548, "The Silver Chair", "C.S. Lewis"),
        new Book("A1", 5, 30, 14549, "The Magician's Nephew", "C.S. Lewis"),
        new Book("A1", 5, 31, 14550, "The Horse and His Boy", "C.S. Lewis"),
        new Book("A1", 5, 32, 14551, "The Last Battle", "C.S. Lewis"),
        new Book("A1", 6, 33, 14552, "American Gods", "Neil Gaiman"),
        new Book("A1", 6, 34, 14553, "Neverwhere", "Neil Gaiman"),
        new Book("A1", 6, 35, 14554, "Stardust", "Neil Gaiman"),
        new Book("A1", 6, 36, 14555, "Good Omens", "Neil Gaiman and Terry Pratchett"),
        new Book("A1", 6, 37, 14556, "Mort", "Terry Pratchett"),
        new Book("A1", 6, 38, 14557, "Guards! Guards!", "Terry Pratchett"),
        new Book("A1", 6, 39, 14558, "Sourcery", "Terry Pratchett"),
        new Book("A1", 6, 40, 14559, "The Colour of Magic", "Terry Pratchett"),
        new Book("A1", 7, 41, 14560, "The Golden Compass", "Philip Pullman"),
        new Book("A1", 7, 42, 14561, "The Subtle Knife", "Philip Pullman"),
        new Book("A1", 7, 43, 14562, "The Amber Spyglass", "Philip Pullman"),
        new Book("A1", 7, 44, 14563, "Jonathan Strange & Mr Norrell", "Susanna Clarke"),
        new Book("A1", 7, 45, 14564, "The Priory of the Orange Tree", "Samantha Shannon"),
        new Book("A1", 7, 46, 14565, "Circe", "Madeline Miller"),
        new Book("A1", 7, 47, 14566, "The Song of Achilles", "Madeline Miller"),
        new Book("A1", 7, 48, 14567, "A Wizard of Earthsea", "Ursula K. Le Guin"),
        new Book("A1", 7, 49, 14568, "The Tombs of Atuan", "Ursula K. Le Guin"),
        new Book("A1", 7, 50, 14569, "The Farthest Shore", "Ursula K. Le Guin"),
        //END OF FICTION AISLE
        // Non-Fiction Aisle
        new Book("A2", 1, 1, 14600, "Sapiens: A Brief History of Humankind", "Yuval Noah Harari"),
        new Book("A2", 1, 2, 14601, "Guns, Germs, and Steel", "Jared Diamond"),
        new Book("A2", 1, 3, 14602, "Bury My Heart at Wounded Knee", "Dee Brown"),
        new Book("A2", 1, 4, 14603, "The Diary of a Young Girl", "Anne Frank"),
        new Book("A2", 2, 5, 14604, "Team of Rivals", "Doris Kearns Goodwin"),
        new Book("A2", 2, 6, 14605, "The Warmth of Other Suns", "Isabel Wilkerson"),
        new Book("A2", 2, 7, 14606, "Salt: A World History", "Mark Kurlansky"),
        new Book("A2", 2, 8, 14607, "The Immortal Life of Henrietta Lacks", "Rebecca Skloot"),
        new Book("A2", 2, 9, 14608, "A People's History of the United States", "Howard Zinn"),
        new Book("A2", 3, 10, 14609, "The Sixth Extinction", "Elizabeth Kolbert"),
        new Book("A2", 3, 11, 14610, "The Power Broker", "Robert Caro"),
        new Book("A2", 3, 12, 14611, "Unbroken", "Laura Hillenbrand"),
        new Book("A2", 3, 13, 14612, "The Devil in the White City", "Erik Larson"),
        new Book("A2", 3, 14, 14613, "Hiroshima", "John Hersey"),
        new Book("A2", 3, 15, 14614, "The Autobiography of Malcolm X", "Malcolm X"),
        new Book("A2", 3, 16, 14615, "Long Walk to Freedom", "Nelson Mandela"),
        new Book("A2", 3, 17, 14616, "Americanah", "Chimamanda Ngozi Adichie"),
        new Book("A2", 3, 18, 14617, "Persepolis", "Marjane Satrapi"),
        new Book("A2", 4, 19, 14618, "Educated", "Tara Westover"),
        new Book("A2", 4, 20, 14619, "Between the World and Me", "Ta-Nehisi Coates"),
        new Book("A2", 4, 21, 14620, "A Brief History of Time", "Stephen Hawking"),
        new Book("A2", 4, 22, 14621, "Silent Spring", "Rachel Carson"),
        new Book("A2", 4, 23, 14622, "The Selfish Gene", "Richard Dawkins"),
        new Book("A2", 4, 24, 14623, "Cosmos", "Carl Sagan"),
        new Book("A2", 4, 25, 14624, "The Double Helix", "James Watson"),
        new Book("A2", 5, 26, 14625, "Surely You're Joking, Mr. Feynman", "Richard Feynman"),
        new Book("A2", 5, 27, 14626, "The Emperor of All Maladies", "Siddhartha Mukherjee"),
        new Book("A2", 5, 28, 14627, "Bad Science", "Ben Goldacre"),
        new Book("A2", 5, 29, 14628, "The Sixth Extinction: An Unnatural History", "Elizabeth Kolbert"),
        new Book("A2", 5, 30, 14629, "The Demon-Haunted World", "Carl Sagan"),
        new Book("A2", 5, 31, 14630, "Why We Sleep", "Matthew Walker"),
        new Book("A2", 5, 32, 14631, "Thinking, Fast and Slow", "Daniel Kahneman"),
        new Book("A2", 5, 33, 14632, "Predictably Irrational", "Dan Ariely"),
        new Book("A2", 5, 34, 14633, "The Power of Habit", "Charles Duhigg"),
        new Book("A2", 6, 35, 14634, "Sapiens: A Brief History of Humankind", "Yuval Noah Harari"),
        new Book("A2", 6, 36, 14635, "The Prince", "Niccolò Machiavelli"),
        new Book("A2", 6, 37, 14636, "The Wealth of Nations", "Adam Smith"),
        new Book("A2", 6, 38, 14637, "The Communist Manifesto", "Karl Marx and Friedrich Engels"),
        new Book("A2", 6, 39, 14638, "Capital in the Twenty-First Century", "Thomas Piketty"),
        new Book("A2", 6, 40, 14639, "Freakonomics", "Steven Levitt and Stephen Dubner"),
        new Book("A2", 7, 41, 14640, "The World Is Flat", "Thomas Friedman"),
        new Book("A2", 7, 42, 14641, "Capitalism and Freedom", "Milton Friedman"),
        new Book("A2", 7, 43, 14642, "The End of History and the Last Man", "Francis Fukuyama"),
        new Book("A2", 7, 44, 14643, "The Road to Serfdom", "Friedrich Hayek"),
        new Book("A2", 7, 45, 14644, "Democracy in America", "Alexis de Tocqueville"),
        new Book("A2", 7, 46, 14645, "The New Jim Crow", "Michelle Alexander"),
        new Book("A2", 7, 47, 14646, "The Power Elite", "C. Wright Mills"),
        new Book("A2", 7, 48, 14647, "Manufacturing Consent", "Noam Chomsky and Edward S. Herman"),
        new Book("A2", 7, 49, 14648, "The Audacity of Hope", "Barack Obama"),
        new Book("A2", 7, 50, 14649, "The Tipping Point", "Malcolm Gladwell"),
        new Book("A2", 8, 51, 14650, "How to Win Friends and Influence People", "Dale Carnegie"),
        new Book("A2", 8, 52, 14651, "Man's Search for Meaning", "Viktor Frankl"),
        new Book("A2", 8, 53, 14652, "The 7 Habits of Highly Effective People", "Stephen Covey"),
        new Book("A2", 8, 54, 14653, "Mindset", "Carol S. Dweck"),
        new Book("A2", 8, 55, 14654, "Daring Greatly", "Brené Brown"),
        new Book("A2", 8, 56, 14655, "Quiet", "Susan Cain"),
        new Book("A2", 8, 57, 14656, "The Power of Now", "Eckhart Tolle"),
        new Book("A2", 8, 58, 14657, "Meditations", "Marcus Aurelius"),
        new Book("A2", 8, 59, 14658, "The Art of War", "Sun Tzu"),
        new Book("A2", 8, 60, 14659, "Tao Te Ching", "Lao Tzu"),
        new Book("A2", 9, 61, 14660, "The Story of Art", "E.H. Gombrich"),
        new Book("A2", 9, 62, 14661, "The Elements of Style", "Strunk & White"),
        new Book("A2", 9, 63, 14662, "Orientalism", "Edward Said"),
        new Book("A2", 9, 64, 14663, "Mythos", "Stephen Fry"),
        new Book("A2", 9, 65, 14664, "A Brief History of Seven Killings", "Marlon James"),
        new Book("A2", 9, 66, 14665, "The Power of Myth", "Joseph Campbell"),
        new Book("A2", 9, 67, 14666, "The Culture Code", "Daniel Coyle"),
        new Book("A2", 9, 68, 14667, "The Defining Decade", "Meg Jay"),
        new Book("A2", 9, 69, 14668, "The Power of Full Engagement", "Jim Loehr and Tony Schwartz"),
        new Book("A2", 10, 70, 14669, "Angela's Ashes", "Frank McCourt"),
        new Book("A2", 10, 71, 14670, "Eat, Pray, Love", "Elizabeth Gilbert"),
        new Book("A2", 10, 72, 14671, "Bossypants", "Tina Fey"),
        new Book("A2", 10, 73, 14672, "Wild", "Cheryl Strayed"),
        new Book("A2", 10, 74, 14673, "Persepolis", "Marjane Satrapi"),
        new Book("A2", 10, 75, 14674, "Becoming", "Michelle Obama"),
        new Book("A2", 10, 76, 14675, "I Know Why the Caged Bird Sings", "Maya Angelou"),
        new Book("A2", 10, 77, 14676, "The Glass Castle", "Jeannette Walls"),
        new Book("A2", 10, 78, 14677, "Educated", "Tara Westover"),
        new Book("A2", 10, 79, 14678, "Born a Crime", "Trevor Noah"),
        new Book("A2", 10, 80, 14679, "Freakonomics", "Steven D. Levitt and Stephen J. Dubner"),
        new Book("A2", 10, 81, 14680, "Outliers", "Malcolm Gladwell"),
        new Book("A2", 10, 82, 14681, "The Tipping Point", "Malcolm Gladwell"),
        new Book("A2", 10, 83, 14682, "Blink", "Malcolm Gladwell"),
        new Book("A2", 10, 84, 14683, "What the Dog Saw", "Malcolm Gladwell"),
        new Book("A2", 10, 85, 14684, "David and Goliath", "Malcolm Gladwell"),
        new Book("A2", 11, 86, 14685, "Sapiens: A Brief History of Humankind", "Yuval Noah Harari"),
        new Book("A2", 11, 87, 14686, "Homo Deus: A Brief History of Tomorrow", "Yuval Noah Harari"),
        new Book("A2", 11, 88, 14687, "21 Lessons for the 21st Century", "Yuval Noah Harari"),
        new Book("A2", 11, 89, 14688, "Factfulness", "Hans Rosling, Ola Rosling, and Anna Rosling Rönnlund"),
        new Book("A2", 11, 90, 14689, "Bad Blood", "John Carreyrou"),
        new Book("A2", 11, 91, 14690, "Hillbilly Elegy", "J.D. Vance"),
        new Book("A2", 11, 92, 14691, "The Righteous Mind", "Jonathan Haidt"),
        new Book("A2", 11, 93, 14692, "Thinking, Fast and Slow", "Daniel Kahneman"),
        new Book("A2", 11, 94, 14693, "Nudge", "Richard Thaler and Cass Sunstein"),
        new Book("A2", 11, 95, 14694, "Predictably Irrational", "Dan Ariely"),
        new Book("A2", 11, 96, 14695, "Influence: The Psychology of Persuasion", "Robert Cialdini"),
        new Book("A2", 11, 97, 14696, "The Power of Habit", "Charles Duhigg"),
        new Book("A2", 11, 98, 14697, "Drive", "Daniel H. Pink"),
        new Book("A2", 11, 99, 14698, "Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain")
        //END OF NON-FICTION AISLE
    };

    public static void printAvailableBooks() {
        System.out.println("Available Books:");
        System.out.println("ID\tTitle                          Author              Aisle Row Column");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Book book : books) {
            System.out.printf("%d\t%-30s%-20s%-5s%d\t%d%n", book.id, book.title, book.author, book.aisle, book.row, book.column);//tnx! w3school<3
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static String getBookInfoById(int id) {
        for (Book book : books) {
            if (book.id == id) {
                return "ID: " + book.id + ", Title: " + book.title + ", Author: " + book.author +
                       ", Aisle: " + book.aisle + ", Row: " + book.row + ", Column: " + book.column;
            }
        }
        return "Book not found:<";//hotdog
    }
}
