// quiz.js - paste the whole file into the browser console and press Enter to run

const quizQuestions = [
  { question: "What is the capital of India?", answer: "Delhi" },
  { question: "Which planet is known as the Red Planet?", answer: "mars" },
  { question: "What is 5 * 7?", answer: "35" },
  { question: "Which language is used for styling web pages?", answer: "css" },
  { question: "What does 'JS' stand for in web development?", answer: "javascript" },
  { question: "What is the boiling point of water in Celsius (approx)?", answer: "100" }
  { question: "Who is prime minister of india?" , answer: "Narendra modi"}
];

function askQuestion(promptText) {
  // prompt the user; handle Cancel (null) gracefully
  const raw = prompt(promptText);
  if (raw === null) return ""; // treat Cancel as empty answer
  return raw.toLowerCase().trim();
}

function runQuiz() {
  let score = 0;
  const total = quizQuestions.length;

  for (let i = 0; i < total; i++) {
    const q = quizQuestions[i];
    const userAnswer = askQuestion(`Question ${i + 1} of ${total}:\n${q.question}`);

    if (userAnswer === q.answer.toLowerCase().trim()) {
      score++;
      alert(`Correct! ✅\nScore: ${score}/${i + 1}`);
    } else {
      // show correct answer (helps learning)
      const displayCorrect = q.answer;
      alert(`Wrong ❌\nCorrect answer: ${displayCorrect}\nScore: ${score}/${i + 1}`);
    }
  }

  alert(`Quiz complete! Final score: ${score} out of ${total}`);
  return score; // useful if you want to capture the return value in console
}

// Auto-run the quiz when the script is pasted
runQuiz();