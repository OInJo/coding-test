function solution(angle) {
  return angle === 180 ? 4 : angle > 90 ? 3 : angle === 90 ? 2 : 1; //angle이 180이면 4, 90초과는 3, 90은 2, 아니면 1
}
